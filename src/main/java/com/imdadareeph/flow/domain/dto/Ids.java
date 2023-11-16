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
public class Ids {
    public String value;
    public String environment;
    public String flowStartTime;
    public String flowEndTime;
    public String flowProcessingTime;
    public ArrayList<Service> service;
}
