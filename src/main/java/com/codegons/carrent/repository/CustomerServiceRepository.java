/**
 * 
 */
package com.codegons.carrent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegons.carrent.model.Car;

/**
 * @author satyendrakumar
 * website : https://www.codegons.com
 */
public interface CustomerServiceRepository extends JpaRepository<Car, Integer>{
	

}
