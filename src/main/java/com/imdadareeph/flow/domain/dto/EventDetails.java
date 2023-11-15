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
public class EventDetails{
    public String eventName;
    public String startState;
    public ArrayList<Api> api;
    public String endState;
}
