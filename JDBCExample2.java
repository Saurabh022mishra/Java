import java.sql.*;
public class JDBCExample2 {
    public static void main(String[] args) {
        Connection conn1=null;
        try{
            String url1="jdbc:mysql://localhost:3306/college";
            String user="root";
            String pass="12345";
            conn1=DriverManager.getConnection(url1,user,pass);
            if(conn1!=null){
                System.out.println("Connection Established");
            }
        }catch (SQLException e){
                System.out.println("Connection not Established");
                e.printStackTrace();
            }
        }
    }

