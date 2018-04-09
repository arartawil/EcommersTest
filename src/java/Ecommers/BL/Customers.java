package Ecommers.BL;

import java.util.List;

public class Customers
{
    Ecommers.DL.Customers DAL=new Ecommers.DL.Customers();

    public int Add(Ecommers.Entity.Customers cus)
    {
        if (Done(cus) == 0)
            return 0;
        else
            return DAL.insert(cus);
    }

    public int Edit(Ecommers.Entity.Customers cus)
    {

        return  DAL.update(cus);

    }

    public int Reomve(int id)
    {
        return DAL.delete(id);
    }

    public int Done(Ecommers.Entity.Customers cus)
    {
        if (String.valueOf(cus.getCustomer_ID()).length() == 0) return 0;
        else if (cus.getCustomer_Name().length()== 0) return 0;
        else if (cus.getCustomer_Email().length() == 0) return 0;
        else if (String.valueOf(cus.getUser_ID()).length() == 0) return 0;
        else if (cus.getUsername().length() == 0) return 0;
        else if (cus.getUser_passsword().length() == 0) return 0;
        //else if (cus.getCreateData().length() == 0) return 0;
        else
            return 1;

    }

    public int getMaxCus()
    {
        return DAL.MaxCus();
    }

    public List<Ecommers.Entity.Customers> getData(String name,String pass)
    {
        return DAL.getData(name,pass);
    }


}
