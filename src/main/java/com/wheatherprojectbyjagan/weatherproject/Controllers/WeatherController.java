package com.wheatherprojectbyjagan.weatherproject.Controllers;

import com.wheatherprojectbyjagan.weatherproject.Dtos.GetWeatherDto;
import com.wheatherprojectbyjagan.weatherproject.Dtos.GetWeatherResponseDto;
import com.wheatherprojectbyjagan.weatherproject.Models.Weather;
import com.wheatherprojectbyjagan.weatherproject.Services.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private WeatherService weatherservice;

    public WeatherController(WeatherService weatherservice){
        this.weatherservice = weatherservice;
    }

    @GetMapping("/city/{city}")
    public @ResponseBody GetWeatherResponseDto getWeatherByCity(@PathVariable("city") String city) throws Exception{

        return weatherservice.getWeatherByCity(city);

    }

//    public @ResponseBody List<GetWeatherDto> getAllWeathers(){
//        return weatherservice.getAllWeathers();
//    }

//    @PostMapping("")
//    public String createWeather(Weather weather){
//
//        System.out.println(weather.getCity());
//        System.out.println(weather.getCountry());
//        System.out.println(weather.getDescription());
//
//        return "Weather Created";

//    }

}
