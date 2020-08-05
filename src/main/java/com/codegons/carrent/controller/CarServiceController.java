/**
 * 
 */
package com.codegons.carrent.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codegons.carrent.model.Car;
import com.codegons.carrent.service.CarService;
import com.codegons.utils.ApplicationConstants;
import com.codegons.exception.APIDataNotFoundException;

/**
 * @author satyendrakumar
 *
 */

@RestController
@RequestMapping(ApplicationConstants.BASE_PATH)
public class CarServiceController {

private static final Logger logger = LoggerFactory.getLogger(CarServiceController.class);
	
@Autowired
private CarService carService;

@RequestMapping(value = "/carservice", method = RequestMethod.GET)

public ResponseEntity<List<Car>> getCarDetails() throws APIDataNotFoundException {
	logger.info("Returning all the ToDo´s");
	return new ResponseEntity<List<Car>>(carService.getCarDetails(), HttpStatus.OK);

}

@RequestMapping(value = "/carservice/{id}", method = RequestMethod.GET)
public ResponseEntity<Car> getCarDetailsById(@PathVariable("id") int id) throws APIDataNotFoundException {
	logger.info("ToDo id to return " + id);
	Optional<Car> car = carService.getCarDetailsById(id);
	logger.info("car::" + car);
	if (car == null ) {
		throw new APIDataNotFoundException("ToDo doesn´t exist", null, null, null);
	}
	return new ResponseEntity(car.get(), HttpStatus.OK);
}

@RequestMapping(value = "/carservice", method = RequestMethod.POST)
public ResponseEntity<Car> saveAllCustomer(@RequestBody Car car) throws APIDataNotFoundException {
	
//	return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	logger.info("car::" + car);
	return new ResponseEntity(carService.saveCarDetails(car), HttpStatus.OK);
	
}

}
