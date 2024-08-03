package com.briz.springbootsingletableexample;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity  // must be defined as entity
@DiscriminatorValue(value="retiredemployee_record")
public class RetiredEmployee extends Employee
{
double pension;

public double getPension() {
	return pension;
}

public void setPension(double pension) {
	this.pension = pension;
}
}
