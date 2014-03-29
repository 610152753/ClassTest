package editData;

import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import properties.ConfigGetDb;
import csvUtil.CsvUtil;
import databaseOption.ComJdbc;

public class ProcessData
{
	public static void main(String[] args)

	{
		try
		{
			String currentPath = System.getProperty("user.dir");
			
			System.out.println("currentPath :" + currentPath );
			
			ComJdbc.connection( currentPath + File.separator + "configdb.properties");

			ConfigGetDb getsql = new ConfigGetDb(currentPath + File.separator + "selectSql.ddl");
			
			String strSql = getsql.execSql; // 将sql中将;去掉

			ResultSet rs = ComJdbc.execQuery(strSql);

			ResultSetMetaData metaDate = rs.getMetaData();

			int columnCount = metaDate.getColumnCount();

			List exportData = new ArrayList();

			Map row1 = null;

			while (rs.next())
			{
				row1 = new LinkedHashMap();

				for (int i = 1; i <= columnCount; i++)
				{
					row1.put(new Integer(i), rs.getString(i));
				}
				exportData.add(row1);
			}

			LinkedHashMap map = new LinkedHashMap();

			for (int i = 1; i <= columnCount; i++)
			{
				map.put(new Integer(i), metaDate.getColumnName(i));
			}

			CsvUtil.createCSVFile(exportData, map, currentPath + File.separator, args[0]);

		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			ComJdbc.close();
		}
	}
}
