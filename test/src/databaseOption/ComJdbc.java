package databaseOption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import properties.ConfigGetDb;

public class ComJdbc
{
	static Connection conn = null;
	
	static Statement stmt = null;
	
	static ResultSet rs = null;
	
	public static void connection(String configfile)
	{
		ConfigGetDb getconfig = new ConfigGetDb(configfile);
		
		String driver = getconfig.driver;
		
		String url = getconfig.url;
		
		String uesr = getconfig.user;
		
		String password = getconfig.password;
		
		try
		{
			Class.forName(driver);

			conn = DriverManager.getConnection(url, uesr, password);
			
		} catch (Exception e)
		{
			System.out.println("Connect DB Failed :" + e);
			
			e.printStackTrace();
		}
	}
	
	public static ResultSet execQuery(String strSql)
	{

		try
		{
			stmt = conn.createStatement();
		} catch (SQLException e)
		{
			System.out.println("Create Statement Failed :" + e);
			
			e.printStackTrace();
		}

		try
		{
			rs = stmt.executeQuery(strSql);
		} catch (SQLException e)
		{
			System.out.println("Query Statement Failed :" +  strSql + e);
			
			e.printStackTrace();
		} 
		
		return rs;
	}
	
	public static void close(){
		
		try
		{
			rs.close();
		} catch (SQLException e)
		{
			System.out.println("Close ResultSet Failed :"  + e);
			
			e.printStackTrace();
		}
		
		try
		{
			stmt.close();
		} catch (SQLException e)
		{
			System.out.println("Close Statement Failed :"  + e);
			e.printStackTrace();
		}
		
		try
		{
			conn.close();
		} catch (SQLException e)
		{
			System.out.println("Close Connection Failed :"  + e);
			e.printStackTrace();
		}
	}
}
