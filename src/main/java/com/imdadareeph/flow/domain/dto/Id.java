package com.imdadareeph.flow.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Id{
    public String value;
    public String environment;
    public String timestamp;
    public String processingTime;
    public ArrayList<Service> service;
}
