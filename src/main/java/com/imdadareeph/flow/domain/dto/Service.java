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
public class Service{
    public String name;
    public String status;
    public ArrayList<Event> events;
}
