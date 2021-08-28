package com.github.thiagoviks.citiesapi.countries.repositories;

import com.github.thiagoviks.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}