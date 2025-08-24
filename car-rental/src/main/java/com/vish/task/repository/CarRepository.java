package com.vish.task.repository;

import com.vish.task.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    // custom queries bhi bana sakte ho jaise available cars
}
