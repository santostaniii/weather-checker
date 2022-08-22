package com.medirecords.weatherchecker.service;

@Service
public class WeatherCheckerServiceImpl implements WeatherCheckerService {

    @GetMapping("/weatherInfo/{city}")
    public WeatherInfo getWeatherInfo(@PathVariable city) {



        return new ResponseEntity<>(result, HttpStatus.OK);

    }

}