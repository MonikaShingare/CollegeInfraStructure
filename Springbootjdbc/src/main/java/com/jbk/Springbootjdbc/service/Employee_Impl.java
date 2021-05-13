package com.jbk.Springbootjdbc.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jbk.Springbootjdbc.dao.Employee_Dao;
import com.jbk.Springbootjdbc.dao.Employee_DaoImpl;
import com.jbk.Springbootjdbc.entity.Employee;


public class Employee_Impl implements Employee_i{
  Employee_Dao dao=new Employee_DaoImpl();
	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String result=dao.saveEmployee(employee);
		return result;
	}
	
	
	
	
	

	
	
	
	

}
