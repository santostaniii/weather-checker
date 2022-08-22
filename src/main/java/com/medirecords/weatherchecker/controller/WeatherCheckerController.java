package com.medirecords.weatherchecker.controller;

@RestController
public class WeatherCheckerController {

    @Autowired
    private WeatherCheckerService weatherCheckerService;

    @GetMapping("/weatherInfo/{city}")
    public WeatherInfo getWeatherInfo(@PathVariable String city) {

        WeatherInfo result = weatherCheckerService.getWeatherInfo(city);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

}