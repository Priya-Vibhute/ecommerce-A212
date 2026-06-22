package com.study.ecommerce.dtos;

import com.study.ecommerce.enums.Role;
import com.study.ecommerce.validators.PasswordMatch;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatch
public class UserDto {

	private String id;
//	
	@NotNull(message="first name cannot be null")
	@NotBlank(message="first name cannot be blank")
	@Size(min = 2,max = 60)
	private String firstName;
	
	@NotNull(message="last name cannot be null")
	@NotBlank(message="last name cannot be blank")
	@Size(min = 2,max = 60)
	private String lastName;
	
	@Pattern(regexp ="^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String email;
	
	@Pattern(regexp = "^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$")
	private String password;
	
	private String confirmPassword;
	
	private Role role;
	
}
