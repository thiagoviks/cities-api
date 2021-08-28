package com.github.thiagoviks.citiesapi.staties.repositories;

import com.github.thiagoviks.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
