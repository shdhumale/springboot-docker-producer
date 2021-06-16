package com.siddhu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siddhu.model.Employee;

@RestController
public class SpringbootDockerProducerController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setName("Siddhu");
		emp.setSalary(3000);

		return emp;
	}

}