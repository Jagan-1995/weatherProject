package com.wheatherprojectbyjagan.weatherproject.Dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetMainDto {

    private double temp;
//    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
//    private int sea_level;
//    private int grnd_level;
    private int humidity;
//    private double temp_kf;



}
