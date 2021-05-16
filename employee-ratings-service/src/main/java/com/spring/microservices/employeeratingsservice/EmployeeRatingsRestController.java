package com.spring.microservices.employeeratingsservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.microservices.employeeratingsservice.*;

@RestController
@RequestMapping("/api/employeeRatingInformation")
public class EmployeeRatingsRestController {
	EmployeeRating employeeRating = new  EmployeeRating(123,"4-star","A");
	
	@RequestMapping("/{empID}")
	public EmployeeRating getEmployeesPersonalDetails(@PathVariable("empID") int empID) {
		return employeeRating;
	}
}
