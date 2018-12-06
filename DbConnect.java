import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnect {

	public static void main(String[] args) {
	try {
		//Get a connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task006", "root","0000");
		//Create a statement
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRes = myStmt.executeQuery("select * from employees");
		//Process the result set
		while (myRes.next())
		{
			System.out.println(myRes.getString("Employee_ID") + "," + myRes.getString("Employee_Name") + "," + myRes.getString("Employee_Email") + "," + myRes.getString("Employee_Mobile"));
		}
		
	}catch (Exception exc) {
		exc.printStackTrace();
	}

	}

}
