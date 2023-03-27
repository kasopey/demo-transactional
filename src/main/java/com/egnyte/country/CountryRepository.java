package com.egnyte.country;

import static com.egnyte.generated.tables.Countries.COUNTRIES;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class CountryRepository {

    private final DSLContext jooq;

    public CountryRepository(DSLContext jooq) {
        this.jooq = jooq;
    }

    public List<Country> getAll() {
        return jooq.selectFrom(COUNTRIES)
                .fetchInto(Country.class);
    }

    public int addCountry(String name) {
        return jooq.insertInto(COUNTRIES)
                .set(COUNTRIES.ID, UUID.randomUUID().toString())
                .set(COUNTRIES.NAME, name)
                .execute();
    }

}
