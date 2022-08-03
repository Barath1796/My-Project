package com.example.demo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class employee1 {
@GetMapping("/employee")
public List<employee> getrestController()
{
	List<employee> employee=new ArrayList<>();
	employee.add(new employee(01,"Barath","Asst.manager"));
	employee.add(new employee(02,"Dinesh","HR.manager"));
	employee.add(new employee(03,"Guna","HOD"));
	employee.add(new employee(04,"Praveen","Staff"));
	employee.add(new employee(05,"Naveen","Worker"));
	return employee;
	
}


}
