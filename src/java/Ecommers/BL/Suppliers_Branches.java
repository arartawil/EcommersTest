package Ecommers.BL;

public class Suppliers_Branches
{
    Ecommers.DL.Suppliers_Branches DAL = new Ecommers.DL.Suppliers_Branches();
    public int Add(Ecommers.Entity.Suppliers_Branches supbra)
    {
        if (Done(supbra) == 0)
            return 0;
        else return DAL.insert(supbra);
    }

    public int Edit(Ecommers.Entity.Suppliers_Branches supbra)
    {
        if (Done(supbra) == 0)
            return 0;
        else return DAL.update(supbra);
    }

    public int Remove(int idbran, int idsup)
    {

        return DAL.delete(idbran, idsup);
    }


    public int Done(Ecommers.Entity.Suppliers_Branches sup)
    {
        if (String.valueOf(sup.getSuppliers_ID()).length() == 0) return 0;
        else if (String.valueOf(sup.getBranch_ID()).length() == 0) return 0;
        else if (String.valueOf(sup.getEmail()).length() == 0) return 0;
        else if (String.valueOf(sup.getAddress()).length() == 0) return 0;
        else if (String.valueOf(sup.getPhones()).length() == 0) return 0;

        else
            return 1;
    }


}
