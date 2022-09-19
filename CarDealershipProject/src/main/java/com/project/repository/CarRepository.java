package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	Optional<Car> findByBrand(String brand);

	Optional<Car> findByModel(String model);

	Optional<Car> findByColor(String color);

	Optional<Car> findByPrice(double price);
	

}
