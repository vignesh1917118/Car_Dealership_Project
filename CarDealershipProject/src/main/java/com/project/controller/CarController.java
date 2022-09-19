package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Car;
import com.project.model.Customer;
import com.project.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
    CarService carService;
	

   @RequestMapping("/hello")
    public String sayHello() {
        return("Hey Badavar Maklu ");
    }

    @GetMapping("/findCarById/{id}")
    public Car getCarById(@PathVariable Long id) {
       return carService.getCarById(id);

   }

    @PostMapping("/insertCar")
    public Car create(@RequestBody  Car car) {
        return carService.create(car);
    }

   @GetMapping("/AllCar")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

   @DeleteMapping("/deleteCarById/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
        System.out.println(id +"Sucessfully deleted");
    }

    @PutMapping("/updateCarPrice/{id}")
    public Car updateCarPrice(@PathVariable Long id , @RequestBody Car car ) {
        return carService.updateCarPrice(id, car);

   }
    
    
    @GetMapping("/findCarByBrand/{brand}")
    public Car findByBrand(@PathVariable String brand) {
    	return carService.findByBrand(brand);
    }
    
    @GetMapping("/findCarByModel/{model}")
    public Car findByModel(@PathVariable String model) {
    	return carService.findByModel(model);
    }

    @GetMapping("/findCarByColor/{color}")
    public Car findByColor(@PathVariable String color) {
    	return carService.findByColor(color);
    }
    
    @GetMapping("/findCarByPrice/{price}")
    public Car findByPrice(@PathVariable double price) {
    	return carService.findByPrice(price);
    }
    
}
