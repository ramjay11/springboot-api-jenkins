package com.ramjava.repository;

import com.ramjava.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    // Custom method
    List<ThemeParkRide> findByName(String name);
}
