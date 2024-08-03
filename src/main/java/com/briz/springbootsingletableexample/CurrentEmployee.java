package com.briz.springbootsingletableexample;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity  // must be defined as entity
@DiscriminatorValue(value="currentemployee_record")
public class CurrentEmployee  extends Employee
{
double salary;
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
