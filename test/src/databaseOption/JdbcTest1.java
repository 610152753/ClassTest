package databaseOption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest1
{

	public static void main(String args[])
	{
		String url = "jdbc:oracle:thin:@192.168.1.105:1521:timran11g"; // HOST:192.168.1.105;PORT:1521;SID_NAME:timran11g
		
		String strSql = "SELECT * FROM t1"; // 将sql中将;去掉
		
		String strSql1 = "SELECT * FROM MYTEST";
		
		String createTable1 = "Create table MYTEST (ID INT,NAME VARCHAR(20))";
		
		String sql1 = "insert into MYTEST (ID,NAME) VALUES(1,'JOE')";
		
		String sql3 = "insert into MYTEST (ID,NAME) VALUES(2,'JOHN')";
		
		String sql2 = "delete MYTEST WHERE ID = 1";
		
		String sql4 = "drop table MYTEST PURGE";
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 建表后先commit才能在其它端中调用

			Connection conn = DriverManager.getConnection(url, "scott", "scott");

			Statement stmt = conn.createStatement();
			
			stmt.execute("insert into t1 (id) values(3)"); // 表已建立，插入记录

			ResultSet rs = stmt.executeQuery(strSql); // 查询语句的使用
			while (rs.next())
			{
				System.out.println("ID:" + rs.getString(1));
			}
			
			stmt.executeUpdate(createTable1); // CREATE TABLE DDL
			
			stmt.executeUpdate(sql1); // INSERT TABLE DATA
			
			stmt.executeUpdate(sql3); // INSERT TABLE DATA
			
			stmt.executeUpdate(sql2); //DELETE TABLE DATA

			ResultSet rs1 = stmt.executeQuery(strSql1); // 查询语句的使用
			
			while (rs1.next())
			{
				System.out.println("MYID:" + rs1.getString(1));
				System.out.println("MYNAME:" + rs1.getString(2));
			}
			
			stmt.executeUpdate(sql4); //dorp table DDL
			
			rs.close();
			rs1.close();
			conn.close();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.exit(0);
	}

}
