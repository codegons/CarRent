package com.codegons.carrent.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
	
	@Getter @Setter private String userId;
	private String password;

}