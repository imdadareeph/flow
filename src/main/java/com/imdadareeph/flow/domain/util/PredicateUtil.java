package com.imdadareeph.flow.domain.util;

import com.imdadareeph.flow.domain.entities.Flow;
import com.imdadareeph.flow.domain.entities.enums.Estatus;
import com.imdadareeph.flow.domain.entities.enums.Hmethod;
import com.imdadareeph.flow.domain.entities.enums.Ltype;

import java.util.Optional;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateUtil {

	public static BiPredicate<Ltype, Ltype> filterLType = (requestValue, enumValue) -> {
		return requestValue.getValue().equalsIgnoreCase(enumValue.getValue());
	};

	public static BiPredicate<Ltype, Ltype> filterLTypeTime = (requestValue, enumValue) -> filterLType.test(requestValue,
		Ltype.E_E_TIME_L);

	public static BiPredicate<Ltype, Ltype> filterLTypeExtRes = (requestValue, enumValue) -> filterLType.test(requestValue,
		Ltype.EXT_RES);

	public static BiPredicate<Ltype, Ltype> filterLTypeIntRes = (requestValue, enumValue) -> filterLType.test(requestValue,
		Ltype.INT_RES);

	public static Predicate<Ltype> filterLTypeExtReq = (requestValue) -> filterLType.test(requestValue,
		Ltype.EXT_REQ);

	public static Predicate<Ltype> filterLTypeIntReq = (requestValue) -> filterLType.test(requestValue,
		Ltype.INT_REQ);

	public static Predicate<Ltype> filterLTypeConsumer = (requestValue) -> filterLType.test(requestValue,
		Ltype.E_CONSUME_L);

	public static BiPredicate<Ltype, Ltype> processingTimePredicate = (requestValue, enumValue) -> {
		return filterLTypeTime.or(filterLTypeExtRes).or(filterLTypeIntRes).test(requestValue,enumValue);
	};

	public static Predicate<Ltype> logTypeReqPredicate = (requestValue) -> {
		return filterLTypeExtReq.or(filterLTypeIntReq).test(requestValue);
	};

	public static void updateProcessingTime(Flow flow) {
		Optional.ofNullable(flow)
			.map(Flow::getLtype)
			.filter(l -> processingTimePredicate.test(l, Ltype.E_E_TIME_L))
			.ifPresent(t -> {
				int etime = randInt(600, 4000);
				flow.setPtime(String.valueOf(etime));
			});
	}

	public static void updateHttpMethod(Flow flow) {
		Hmethod hmethod = Optional.ofNullable(flow)
			.filter(l -> logTypeReqPredicate.test(l.getLtype()))
			.map(Flow::getHmethod)
			.orElse(Hmethod.NA);
		flow.setHmethod(hmethod);
	}

	public static void updateEStatus(Flow flow) {
		Estatus estatus = Optional.ofNullable(flow)
			.filter(l -> filterLTypeConsumer.test(l.getLtype()))
			.map(Flow::getEstatus)
			.orElse(Estatus.PENDING);
		flow.setEstatus(estatus);
	}

	public static void setProcessingTime(Flow flow) {
		Optional.ofNullable(flow)
			.map(Flow::getLtype)
			.filter(l -> processingTimePredicate.test(l, Ltype.E_E_TIME_L))
			//.filter(l -> filterLType.test(l, Ltype.E_E_TIME_L))
			//.filter(getLtypePredicate(Ltype.E_E_TIME_L))
			.ifPresent(t -> {
				flow.setPtime("4200");
			});

		Optional.ofNullable(flow)
			.map(Flow::getLtype)
			.filter(getLtypePredicate(Ltype.EXT_RES))
			.ifPresent(t -> flow.setPtime("800"));

		Optional.ofNullable(flow)
			.map(Flow::getLtype)
			.filter(getLtypePredicate(Ltype.INT_RES))
			.ifPresent(t -> flow.setPtime("600"));
	}


	public static Predicate<Ltype> getLtypePredicate(Ltype eetl) {
		return l -> l.getValue().equalsIgnoreCase(eetl.getValue());
	}

	public static int randInt(int lowerBound, int upperBound) {
		Random random = new Random();
		return random.nextInt(upperBound - lowerBound) + lowerBound;
	}

}
