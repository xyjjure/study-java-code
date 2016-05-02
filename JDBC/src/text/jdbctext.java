package text;
import java.sql.*;
public class jdbctext {
  public static void main(String args[]) {
	   ResultSet rs=null;
	   Statement stmt=null;
	   Connection connect=null;
    try {
      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
      //Class.forName("org.gjt.mm.mysql.Driver");
     System.out.println("Success loading Mysql Driver!");
      connect = DriverManager.getConnection(
          "jdbc:mysql://localhost/test","root","");
           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
      System.out.println("Success connect Mysql server!");
      stmt = connect.createStatement();
      rs = stmt.executeQuery("select * from user");                                                              //user 为你表的名称
while (rs.next()) {
	   
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("password"));
      }
    }
    catch (ClassNotFoundException e) {
      System.out.print("get data error!");
      e.printStackTrace();
    }
    catch(SQLException e){
    	e.printStackTrace();
    }
    finally{
    	try{
           if(rs!=null){
        	   rs.close();
        	   rs=null;
           }
           if(stmt!=null){
        	   stmt.close();
        	   stmt=null;
           }
           if(connect!=null){
        	   connect.close();
        	   connect=null;
           }
    	}catch(SQLException e){
     	   e.printStackTrace();
        }
    }
  }
}