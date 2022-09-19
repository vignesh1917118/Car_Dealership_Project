package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Car;
import com.project.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository cr;


	public Car getCarById(Long id) {
		return cr.findById(id).get();
	}

	public Car create(Car car) {
		return cr.save(car);
	}

	public List<Car> getAllCars() {
		return cr.findAll();
	}

	public void deleteCarById(Long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		
	}



	public Car updateCarPrice(Long id,Car car) {
		Car carToUpdate = getCarById(id);
		carToUpdate.setModel(car.getModel());
		carToUpdate.setBrand(car.getBrand());
		carToUpdate.setPrice(car.getPrice());
		carToUpdate.setColor(car.getColor());
		carToUpdate.setYom(car.getYom());
		carToUpdate.setKmDriven(car.getKmDriven());
		//carToUpdate.setCustom
		cr.save(carToUpdate);
             
		return car;
	}

	public Car findByBrand(String brand) {
		// TODO Auto-generated method stub
		
		return cr.findByBrand(brand).get();
	}

	public Car findByModel(String model) {
		// TODO Auto-generated method stub
		return cr.findByModel(model).get();
	}

	public Car findByColor(String color) {
		// TODO Auto-generated method stub
		return cr.findByColor(color).get();
	}

	public Car findByPrice(double price) {
		// TODO Auto-generated method stub
		return cr.findByPrice(price).get();
	}
	
}
