package com.egnyte.country;

import static org.apache.commons.lang3.StringUtils.isBlank;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CountriesService {

    private final CountryRepository countryRepository;

    public CountriesService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Collection<Country> getCountries() {
        return countryRepository.getAll();
    }

    @Transactional
    public int addCountry(String name, boolean withException) {
        validate(name);
        return executeInDatabase(name, withException);
    }

    private void validate(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
    }

    public int executeInDatabase(String name, boolean withException) {
        int result = countryRepository.addCountry(name);
        if (withException) {
            throw new RuntimeException("End of the internet...");
        }
        return result;
    }

}
