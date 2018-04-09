package Ecommers.Others;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")

public class TEst extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TEst  myClass = new TEst();
        String button = request.getParameter("button1");

        if ("Login".equals(button)) {
            myClass.method1();
        } else if ("button2".equals(button)) {
            myClass.method2();
        } else if ("button3".equals(button)) {
            myClass.method3();
        } else {
            // ???
        }

        //request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
    }


    public void method1()
    {
        System.out.println("Arartawil1");
    }

    public void method2()
    {
        System.out.println("Arartawil");
    }

    public void method3()
    {
        System.out.println("Arartawil");
    }


}
