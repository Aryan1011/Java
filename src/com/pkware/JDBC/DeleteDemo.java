package GradleDependency;

import java.sql.*;

public class DeleteDemo {

	static String driverClassname = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/postgres";
	static String username = "postgres";
	static String password = "postgres";
	static String query = "DELETE FROM public.newtable where name = 'Avi';";

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {

			con = getConnection();
			st = con.createStatement();
			int c = st.executeUpdate(query);
			System.out.println(c);
		} finally {
			st.close();
			con.close();
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName(driverClassname);
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
