package com.udacity.pricing.domain.price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface PriceRepository extends JpaRepository<Price, Long> {

    Price findByVehicleId(String name);
}
