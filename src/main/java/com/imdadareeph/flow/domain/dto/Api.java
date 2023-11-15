package com.imdadareeph.flow.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Api{
    public String apiName;
    public String httpStatus;
    public String level;
    public String url;
    public LogType logType;
    public String status;
}
