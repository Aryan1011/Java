package GradleDependency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	static String driverClassname = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/postgres";
	static String username = "postgres";
	static String password = "postgres";
	static String query = "INSERT INTO public.newtable(name,age) VALUES('kanav',9)";

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
