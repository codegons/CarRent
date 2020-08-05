/**
 * 
 */
package com.codegons.carrent.service;

import java.util.List;
import java.util.Optional;

import com.codegons.carrent.model.Car;

/**
 * @author satyendrakumar
 * website : https://www.codegons.com
 */
public interface CarService {
	
	public Car saveCarDetails(Car car);
	public List<Car> getCarDetails();
	public Optional<Car> getCarDetailsById(int id);
}
