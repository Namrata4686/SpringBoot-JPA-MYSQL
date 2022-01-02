package com.namrata.SpringBootJPAMYSQL.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.namrata.SpringBootJPAMYSQL.Entity.Employee;
import com.namrata.SpringBootJPAMYSQL.Repository.EmployeeRepository;


import net.bytebuddy.description.annotation.AnnotationValue.Sort;



@RestController
public class EmployeeController {
	
	@Autowired
	private final EmployeeRepository er;

	public EmployeeController(EmployeeRepository er) {
		this.er = er;
	}

	@PostMapping(path ="/addEmployee")
	public void addEmployee(@RequestBody Employee employee){
		er.save(employee);
	}
	
	@GetMapping(path = "/findEmployeeById/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id){
		return er.findById(id);
	}

	@GetMapping(path = "/findallEmployees")
	public List<Employee> getEmployeeByAsc(){
		return er.findAll();
	}
}
