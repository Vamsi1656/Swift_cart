package com.greetlabs.swiftcart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {
	
    private Long id;
	private String firstName;
	private String lastName;
	private Long userMobile;
	private Long alterMobile;
	private String userEmail;
	
	private Long adressId;

	private Integer pinCode;

	private String locality;

	private String city;

	private String state;

	private String country;


}
