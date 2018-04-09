package Ecommers.DL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Customers
{
   public  int insert(Ecommers.Entity.Customers cus)
   {

       int state=0;
       try
       {
           Connection con= Connections.getConnection();
           PreparedStatement ps=con.prepareStatement("INSERT INTO `Ecommers`.`Customers`\n" +
                   "(`Customer_ID`,\n" +
                   "`Customer_Name`,\n" +
                   "`Customer_Email`,\n" +
                   "`User_ID`,\n" +
                   "`Username`,\n" +
                   "`User_password`)\n" +
                   "VALUES(?,?,?,?,?,?)");
           ps.setInt(1,cus.getCustomer_ID());
           ps.setString(2,cus.getCustomer_Name());
           ps.setString(3,cus.getCustomer_Email());
           ps.setString(4,cus.getUser_ID());
           ps.setString(5,cus.getCustomer_Email());
           ps.setString(6,cus.getUser_passsword());
           state=ps.executeUpdate();
       }
       catch (Exception e)

       {
           System.out.println(e);
       }
       return state;
   }

    public int update(Ecommers.Entity.Customers cus)
    {
        return 0;
    }

    public int delete(int id)
    {
        return 0;
    }


    public  int MaxCus()
    {
        int max=0;
        Connection con=Connections.getConnection();
        try
        {
            PreparedStatement ps=con.prepareStatement("select max(Customer_ID)+1 from Ecommers.Customers");
            ResultSet s=ps.executeQuery();
            while(s.next())
            {
                max=s.getInt(1);
            }
            return max;
        }catch (Exception e)
        {
            return max;
        }
    }


    public List<Ecommers.Entity.Customers>getData(String name,String password)
    {
        List<Ecommers.Entity.Customers> CusList=new ArrayList<>();
        Connection con=Connections.getConnection();
        try
        {
            String sql="select * from Ecommers.Customers where Username=? and User_password=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Ecommers.Entity.Customers customers=new Ecommers.Entity.Customers();
                customers.setCustomer_Name(rs.getString("Customer_Name"));
                customers.setCustomer_ID(rs.getInt("User_ID"));
                customers.setCustomer_Email(rs.getString("Customer_Email"));
                customers.setCustomer_ID(rs.getInt("Customer_ID"));
                customers.setIsASupplier(rs.getInt("isASupplier"));
                CusList.add(customers);
            }

        }
        catch (Exception ex)
        {

        }
        return CusList;
    }
}
