package Ecommers.Others;

import Ecommers.Entity.Customers;
import Ecommers.Entity.Customers;
import com.mysql.jdbc.log.Log;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/loginreg")

public class LoginReg extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginReg myClass = new LoginReg();
        String button = request.getParameter("button1");

        if ("Login".equals(button))
        {
            Ecommers.BL.Customers blCus=new Ecommers.BL.Customers();
            String name=request.getParameter("txt_name");
            String password=request.getParameter("txt_password");

            List<Customers> customersList= blCus.getData(name,password);

            if(customersList.size()>0)
            {
                System.out.println(1);
            }
            else
                {
                System.out.println(0);
            }
        }
        else if ("Sign Up".equals(button))
        {

            Ecommers.BL.Customers Bl_Customer=new Ecommers.BL.Customers();
            Ecommers.Entity.Customers Custmer=new Customers();
            int max=Bl_Customer.getMaxCus();
            Custmer.setCustomer_ID(max);
            Custmer.setCustomer_Name(request.getParameter("txtFname")+request.getParameter("txt_Lname"));
            Custmer.setCustomer_Email(request.getParameter("txt_Email"));
            Custmer.setUsername(request.getParameter("txt_Username"));
            Custmer.setUser_passsword(request.getParameter("txt_Password"));
            Custmer.setUser_ID(String.valueOf(max));
            int x=Bl_Customer.Add(Custmer);
            if(x>0)
            {
                response.sendRedirect("Login.jsp");

            }
        }

    }


}
