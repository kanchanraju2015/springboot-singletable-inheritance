package com.briz.springbootsingletableexample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/test")
public String test()
{
return "this is single table test";	
}
@RequestMapping("/save")
public String save()
{
Employee employee=new Employee();employee.setName("rohan");employee.setAge(90);employee.setGender("male");
CurrentEmployee cem=new CurrentEmployee();cem.setAge(45);cem.setGender("male");cem.setName("manu");cem.setSalary(15000);
RetiredEmployee remp=new RetiredEmployee();remp.setAge(78);remp.setGender("male");remp.setName("anuj");remp.setPension(5000);
erepo.save(employee);
erepo.save(remp);
erepo.save(cem);
return "data saved into single tables";
}
@RequestMapping("/all")
public List<Employee> alldata()
{
	return erepo.findAll();
}
@RequestMapping("/by/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	return erepo.findById(id);
}

}
