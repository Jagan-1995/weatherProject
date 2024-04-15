package com.wheatherprojectbyjagan.weatherproject.Dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class GetWeatherResponseDto {

//    private List<GetWeatherDto> weather;
    private String name;
//    private String base;
//    private Long id;
//    private Long dt;
//    private Double main;
    private GetMainDto main;
}
