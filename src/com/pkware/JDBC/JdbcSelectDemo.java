package GradleDependency;

import java.sql.*;

public class JdbcSelectDemo {

	static String driverClassname = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/postgres";
	static String username = "postgres";
	static String password = "postgres";
	static String query = "SELECT * FROM public.newtable;";

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			try {
				while (rs.next()) {
					System.out.print("Name : " + rs.getString("name") + " ");
					System.out.println("Age : " + rs.getInt("age"));

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
