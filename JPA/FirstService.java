package edu.ksr.springboottraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstService {
	
	public FirstService(){
		
	}
	@GetMapping(path="/hello")
	public String hello(){
		return "Welcome to Spring boot";
	}
	@GetMapping(path="/emp")
	public Employee getEmp(){
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Sathish");
		emp.setOrgName("KSR");
		Address address = new Address();
		address.setCity("chennai");
		address.setDoorno("12");
		address.setStreet("kumaran");
		emp.setAddress(address);
		return emp;
	}
	
}








