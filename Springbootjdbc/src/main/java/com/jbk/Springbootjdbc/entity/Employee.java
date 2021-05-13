package com.jbk.Springbootjdbc.entity;

public class Employee {
private int employeeID;
private String employeeFirstName;
private String employeeLastName;
private double employeeSalary;
private String employeeDepartment;
public String getEmployeeFirstName;
public Employee() {
	super();
}
public Employee(int employeeID, String employeeFirstName, String employeeLastName, double employeeSalary,
		String employeeDepartment) {
	super();
	this.employeeID = employeeID;
	this.employeeFirstName = employeeFirstName;
	this.employeeLastName = employeeLastName;
	this.employeeSalary = employeeSalary;
	this.employeeDepartment = employeeDepartment;
}








public int getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}
public String getEmployeeFirstName() {
	return employeeFirstName;
}
public void setEmployeeFirstName(String employeeFirstName) {
	this.employeeFirstName = employeeFirstName;
}
public String getEmployeeLastName() {
	return employeeLastName;
}
public void setEmployeeLastName(String employeeLastName) {
	this.employeeLastName = employeeLastName;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public String getGetEmployeeFirstName() {
	return getEmployeeFirstName;
}
public void setGetEmployeeFirstName(String getEmployeeFirstName) {
	this.getEmployeeFirstName = getEmployeeFirstName;
}
@Override
public String toString() {
	return "Employee [employeeID=" + employeeID + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
			+ employeeLastName + ", employeeSalary=" + employeeSalary + ", employeeDepartment=" + employeeDepartment
			+ "]";
}




}
