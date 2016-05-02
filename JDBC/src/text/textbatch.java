package text;
import java.sql.*;
public class textbatch {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata","root", "");
			stat = conn.createStatement();
			conn.setAutoCommit(false);
			stat.addBatch("insert into mydept values ('111','java','xian')");
			stat.addBatch("insert into mydept values ('222','JAVA','fuzhou')");
			stat.addBatch("insert into mydept values ('333','JAva','xiamen')");
			stat.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
//			PreparedStatement pstat = conn.prepareStatement("insert into mydept values (?,?,?)");
//			pstat.setInt(1,12);
//			pstat.setString(2, "lucky");
//			pstat.setString(3, "where");
//			pstat.addBatch();
//			
//			pstat.setInt(1,13);
//			pstat.setString(2, "Happy");
//			pstat.setString(3, "where");
//			pstat.addBatch();
//			
//			pstat.setInt(1,14);
//			pstat.setString(2, "NO");
//			pstat.setString(3, "where");
//			pstat.addBatch();
//			pstat.executeBatch();
//			pstat.close();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
			try{
				if(conn != null){
				conn.rollback();
				conn.setAutoCommit(true);
				}
			}catch (SQLException e1){
				e.printStackTrace();
			}
		}finally{
			try{
			if(stat != null){
				stat.close();
				stat = null;
			}
			if(conn != null){
				conn.close();
				conn = null;
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

	}

}
