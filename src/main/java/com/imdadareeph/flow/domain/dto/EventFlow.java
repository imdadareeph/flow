package com.imdadareeph.flow.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EventFlow {
    public ArrayList<Id> id;
}
