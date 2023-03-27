package com.egnyte.country;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/country", produces = APPLICATION_JSON_VALUE)
public class CountriesController {

    private static final Logger log = LoggerFactory.getLogger(CountriesController.class);

    private final CountriesService countryService;

    public CountriesController(CountriesService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public Collection<Country> getCountries() {
        return countryService.getCountries();
    }

    @PostMapping
    public ResponseEntity<String> addCountry(@RequestParam String name, @RequestParam(defaultValue = "false") boolean withException) {
        try {
            return ok("Added countries count: " + countryService.addCountry(name, withException));
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
            return status(BAD_REQUEST).body("400: " + e.getMessage());
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return status(INTERNAL_SERVER_ERROR).body("500: " + e.getMessage());
        }
    }

}
