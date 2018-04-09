package Ecommers.DL;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections
{

    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/Ecommers","root","2281996");
        }catch(Exception e){System.out.println(e);}
        return con;
    }
}
