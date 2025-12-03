package com.railway_application.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path = "/get_user")
    public String getUser(){

        Optional<Employee> employee = employeeRepository.findById(Integer.parseInt("1"));
        return employee.get().getUsername()+employee.get().getEmail()+employee.get().getGender();
    }

    @PostMapping(path = "/insert_employee")
    public Employee save(){
        Employee employee = new Employee();
        employee.setEmail("massshaik4196@gmail.com");
        employee.setGender("M");
        employee.setUserName("massshaik4196");

        return employeeRepository.save(employee);
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
