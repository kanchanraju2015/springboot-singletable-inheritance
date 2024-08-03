package com.briz.springbootsingletableexample;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // equivalent to the default same with no inheritance 
//The Single Table strategy creates one table for each class hierarchy.
//JPA also chooses this strategy by default if we don’t specify one explicitly.
@DiscriminatorColumn(name="record_type",discriminatorType=DiscriminatorType.STRING)// changes the dtype
@DiscriminatorValue(value="employee_record")
@Entity(name="employee")
public class Employee 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
String gender;
int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}
