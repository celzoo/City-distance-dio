package com.github.celzoo.citiesapi.repository;

import com.github.celzoo.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository  extends JpaRepository<Country, Long> {

}
