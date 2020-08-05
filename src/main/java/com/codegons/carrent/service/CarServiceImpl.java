/**
 * 
 */
package com.codegons.carrent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegons.carrent.model.Car;
import com.codegons.carrent.repository.CustomerServiceRepository;

/**
 * @author satyendrakumar
 * website : https://www.codegons.com
 */
@Service("CarService")
public class CarServiceImpl implements CarService {
	
	
	@Autowired
	CustomerServiceRepository customerServiceRepository;
	
    @Override
	public Car saveCarDetails(Car car) {
		
	return customerServiceRepository.save(car);
		
	}
    
    
    @Override
   	public List<Car> getCarDetails() {
   		
   	return customerServiceRepository.findAll();
   		
   	}
    
    
    public Optional<Car> getCarDetailsById(int id) {
   		
   	return customerServiceRepository.findById(id);
 	
   	}

}
