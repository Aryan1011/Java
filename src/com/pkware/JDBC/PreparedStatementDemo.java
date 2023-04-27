package GradleDependency;

import java.sql.*;

public class PreparedStatementDemo {

	static String driverClassname = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/postgres";
	static String username = "postgres";
	static String password = "postgres";

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = getConnection();
			st = con.prepareStatement("UPDATE public.newtable SET age = ? where name = ?;");
			st.setInt(1, 9);
			st.setString(2, "abhijeet");
			int c = st.executeUpdate();
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
