import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String pass = "27912289abcD@";
		Connection con = DriverManager.getConnection(url, userName, pass);
		Statement st = con.createStatement();
		
//		String query = "Create database Students";
//		st.executeUpdate(query);
//		System.out.println("Database Created Sucessfully");
		
		
//		String query2 ="create table StudentRegistation"+
//					"(ID int not NULL,"+
//					"firstName varchar(25),"+
//					"lastName varchar(25),"+
//					"age int ,"+
//					"primary key(ID))";
//		st.executeUpdate(query2);
		
		
		
//		String insert;
//		insert = "INSERT INTO StudentRegistation VALUES (101, 'Pritam', 'nikalje', 21)";
//        st.executeUpdate(insert);
//        insert = "INSERT INTO StudentRegistation VALUES (102, 'Sarah', 'Siddiqui', 22)";
//        st.executeUpdate(insert);
//        insert = "INSERT INTO StudentRegistation VALUES (103, 'Sahil', 'Siddiqui', 20)";
//        st.executeUpdate(insert);
		
		

//		String query="INSERT INTO StudentRegistation(ID, firstName, lastName,age)VALUES(?, ?, ?, ?)";
//		PreparedStatement pstmt = con.prepareStatement(query);
//		pstmt.setInt(1,106);
//		pstmt.setString(2, "Zainab");
//		pstmt.setString(3, "Khan");
//		pstmt.setInt(4, 22);
//		pstmt.execute();
		
	    
		
		String query4 = "SELECT id, firstName, lastName, age FROM StudentRegistation";
		ResultSet rs = st.executeQuery(query4);
		System.out.println("ID :firstName :LastName : Age");
		while(rs.next()) {
			String name = rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4);
			System.out.println(name);
		}
////		
		
		
//		String query4 = "update StudentRegistation set age=25 where firstName='Sahil'";
//		st.executeUpdate(query4);
		
		
//		String query5= "Delete from StudentRegistation where ID=101";
//	     st.executeUpdate(query5);
		
		
//		 String query5 = "drop table StudentRegistation";
//         st.executeUpdate(query5);
		
		
		st.close();
		con.close();
		
	}

}
