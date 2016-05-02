package text;
import java.sql.*;
public class textDML {

	public static void main(String[] args) {
		if(args.length!=2){
			System.out.println("Error!");
		}
		String s1=args[0];
		String s2=args[1];
		PreparedStatement pstmt = null;
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			pstmt = conn.prepareStatement("insert into user values (?,?)");
			pstmt.setString(1,s1);
			pstmt.setString(2, s2);
			pstmt.executeUpdate();
			}catch(ClassNotFoundException e){
			     e.printStackTrace();
		    }catch(SQLException e){
		         e.printStackTrace();
		    }finally{
		    	try{
		    		if(pstmt!=null){
		    			pstmt.close();
		    			pstmt = null;
		    		}
		    		if(conn!=null){
		    			conn.close();
		    			conn = null;
		    		}
		    	}catch(SQLException e){
		    		e.printStackTrace();
		    	}
		    }
		

	}

}
