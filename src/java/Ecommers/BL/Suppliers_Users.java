package Ecommers.BL;

public class Suppliers_Users
{
    Ecommers.DL.Suppliers_Users DAL = new Ecommers.DL.Suppliers_Users();

    public int Add(Ecommers.Entity.Suppliers_Users usersup)
    {
        if (Done(usersup) == 0)
            return 0;
        else
            return DAL.insert(usersup);
    }

    public int Edit(Ecommers.Entity.Suppliers_Users usersup)
    {
        if (Done(usersup) == 0) return 0;
        else
            return  DAL.update(usersup);
    }

    public int Reome(int iduser,int idbrsh,int idsup)
    {
        return DAL.delete(iduser, idsup, idbrsh);

    }



    public  int Done(Ecommers.Entity.Suppliers_Users supuser)
    {

        if (String.valueOf(supuser.getSuppliers()).length() == 0) return 0;
        else if (String.valueOf(supuser.getBranch_ID()).length() == 0) return 0;
        else if (String.valueOf(supuser.getUser_ID()).length() == 0) return 0;
        else
            return 1;

    }
}
