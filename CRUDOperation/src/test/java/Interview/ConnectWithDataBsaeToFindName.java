package Interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class ConnectWithDataBsaeToFindName {

	public static void main(String[] args) throws SQLException {

		Connection conn=null;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			Statement stat=conn.createStatement();
			String query = "select * from tyss";
			ResultSet resultSet = stat.executeQuery(query);

			int result=0;
			while(resultSet.next())
			{
				if(resultSet.getString(1).equals(name))
				{
					System.out.println("Name is already present");
				}
				else
				{
					Statement state = conn.createStatement();
					String query1 = "insert into tyss values("+"'"+name+"'"+")";
					result = state.executeUpdate(query1);
				}
			}
			if(result==1)
			{
				System.out.println("Name is not in database and added ");
			}
		}

		catch (Exception e) {

		}
		finally {
			conn.close();
		}
	}
}