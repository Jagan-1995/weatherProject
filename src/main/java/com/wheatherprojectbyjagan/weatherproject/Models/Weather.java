package com.wheatherprojectbyjagan.weatherproject.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Weather {

    private String city;
    private String country;
    private Long zip_code;
    private String description;
    private Double temp;

    private int id;
    private String name;

    private int timezone;
    private long sunrise;
    private long sunset;
}
