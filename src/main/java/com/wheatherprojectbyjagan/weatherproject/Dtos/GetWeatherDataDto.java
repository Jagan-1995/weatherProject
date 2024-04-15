package com.wheatherprojectbyjagan.weatherproject.Dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class GetWeatherDataDto {

    private long dt;
    private GetMainDto main;
    private List<GetWeatherDto> wt;
    private GetCloudsDto clouds;
    private GetWindDto wind;
    private int visibility;
    private double pop;
    private GetRainDto rain;
    private GetSysDto sys;
    private String dt_txt;
}
