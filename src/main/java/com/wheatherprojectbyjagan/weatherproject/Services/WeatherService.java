package com.wheatherprojectbyjagan.weatherproject.Services;
import com.wheatherprojectbyjagan.weatherproject.Dtos.GetWeatherResponseDto;
import com.wheatherprojectbyjagan.weatherproject.Exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

//    @Value("${openWeather.url-cityTemp}")
    private String BaseURLCityTemp;
//    @Value("${openWeather.token}")
    private String token;


    public WeatherService(@Value("${openWeather.url-cityTemp}") String baseURLCityTemp, @Value("${openWeather.token}") String token) {
        BaseURLCityTemp = baseURLCityTemp;
        this.token = token;
    }

    RestTemplate restTemplate = new RestTemplate();

    public GetWeatherResponseDto getWeatherByCity(String city) throws NotFoundException{

        String url = BaseURLCityTemp+"?q="+city+"&appid="+token;
        GetWeatherResponseDto weather = restTemplate.getForObject(url, GetWeatherResponseDto.class);

//        System.out.println(weather);

        if(weather == null){
            throw new NotFoundException();
        }


//        return weather.toString();
        return weather;

    }

//    private static GetWeatherDto convertToDto(Weather weather){
//
//        GetWeatherDto obj = new GetWeatherDto();
//        obj.setCity(weather.getCity());
//        obj.setTemp(weather.getTemp());
//
//        return obj;
//    }

//    public List<GetWeatherDto> getAllWeathers() {
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        String url = "http://bulk.openweathermap.org/sample/";
//
//        Weather []weathers = restTemplate.getForObject(url, Weather[].class);
//
//        List<GetWeatherDto> returnedWeathers = new ArrayList<>();
//
//        for(Weather weather : weathers){
//
//            returnedWeathers.add(convertToDto(weather));
//        }
//
//        return returnedWeathers;
//    }
}
