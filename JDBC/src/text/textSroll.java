package text;
import java.sql.*;
public class textSroll {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata","root","");
			stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = stat.executeQuery("select * from mydept order by num");
			rs.next();
			System.out.println(rs.getInt(1));
			rs.last();
			System.out.println(rs.getString(1));
			System.out.println(rs.isLast());
			System.out.println(rs.isAfterLast());
			System.out.println(rs.getRow());
			rs.previous();
			System.out.println(rs.getString(1));
			rs.absolute(6);
			System.out.println(rs.getString(1));
			rs.close();
			stat.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
