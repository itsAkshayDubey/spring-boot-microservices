package com.spring.microservices.employeeinformationservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.microservices.employeeinformationservice.EmployeePersonalDetails;

@RestController
@RequestMapping("/api/employeePersonalInformation")
public class EmployeePersonalInformationDetailsRestController {
	private EmployeePersonalDetails employeePersonalDetails = new EmployeePersonalDetails(123,"21-June-1997","California");
	
	@RequestMapping("/{empID}")
	public EmployeePersonalDetails getEmployeesPersonalDetails(@PathVariable("empID") int empID) {
		return employeePersonalDetails;
	}
}
