package Variables_library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBase_Utility {
	
	Driver driver;
	Connection con;

	/**
	 * This method will connect to database
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException
	{
		driver = new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(Iconstant.dbURL, Iconstant.dbUser, Iconstant.dbPassword);
		                                              // projects is the database name
	}

	/**
	 * 	This method will close the database connection
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException
	{
		con.close();
	}

	/**
	 * This method will execute the query and return the value if the 
	 * condition is matched
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String executeQueryAndReturnData(String query, int columnIndex, String expData) throws SQLException
	{
		boolean flag = false;

		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			String actData = result.getString(columnIndex);
			if(expData.equalsIgnoreCase(actData))
			{
				flag = true;
				break;
			}
		}

		if(flag==true)
		{
			System.out.println("data verified");
			return expData;
		}
		else
		{
			System.out.println("Not matched");
			return " ";
		}
	}
}
