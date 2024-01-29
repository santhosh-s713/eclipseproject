package files;

import java.sql.*;
public class HI {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="Tech@123";
		String query="select*from hello";
Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);


 while(rs.next())
		 {
 System.out.println(rs.getInt(1));
 System.out.println(rs.getString(2));
 System.out.println(rs.getString(3));
		 }
 
 con.close();


	}

}
