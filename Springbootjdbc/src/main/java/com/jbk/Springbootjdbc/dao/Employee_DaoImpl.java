package com.jbk.Springbootjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jbk.Springbootjdbc.configuration.DBUtil;
import com.jbk.Springbootjdbc.entity.Employee;

public class Employee_DaoImpl implements Employee_Dao{
    private Connection connection;
	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		connection=DBUtil.getconnection();
		String message=null;
		try{
			String sql="INSERT INTO employee(employeeFirstName,employeeLastName,employeeSalary,employeeDepartment)values(?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			preparedStatement.setString(1, employee.getEmployeeFirstName());
			preparedStatement.setString(2, employee.getEmployeeLastName());
			preparedStatement.setDouble(3, employee.getEmployeeSalary());
			preparedStatement.setString(4, employee.getEmployeeDepartment());
			
			int result=preparedStatement.executeUpdate();
			if(result>0)
			{
				message= "success";
			}
			else
			{
				message= "failed";
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return message;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
