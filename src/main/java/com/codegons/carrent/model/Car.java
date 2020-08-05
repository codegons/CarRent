/**
 * 
 */
package com.codegons.carrent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author satyendrakumar
 * website : https://www.codegons.com
 */
@Entity
@Table(name = "car")
@Data
public class Car {
	@Id
	private int id;
	private String name;
	private String model;
	private String make;
	private String registrationNo;
	private String year;

}
