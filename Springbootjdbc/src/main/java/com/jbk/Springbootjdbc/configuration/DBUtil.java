package com.jbk.Springbootjdbc.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	private static Connection connection;
	public static Connection getconnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/decojt", "root", "root");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return connection;
		
	}

}
