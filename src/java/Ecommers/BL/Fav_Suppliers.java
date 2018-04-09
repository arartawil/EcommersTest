package Ecommers.BL;

public class Fav_Suppliers
{

    Ecommers.DL.Fav_Suppliers DAL = new Ecommers.DL.Fav_Suppliers();
    public int Add(Ecommers.Entity.Fav_Suppliers favsup)
    {
        if (Done(favsup) == 0)
            return 0;
        return DAL.insert(favsup);
    }

    public int Edit(Ecommers.Entity.Fav_Suppliers fav)
    {

        return DAL.update(fav);
    }

    public int delte(int id,int idsupp)
    {

        return DAL.delete(id,idsupp);
    }

    public int Done(Ecommers.Entity.Fav_Suppliers fav_sup)
    {
        if (String.valueOf(fav_sup.getCustomer_ID()).length() == 0) return 0;
        else if (String.valueOf(fav_sup.getSuppliers_ID()).length()== 0) return 0;
        else if (String.valueOf(fav_sup.getList_Counter()).length() == 0) return 0;
            //  else if (fav_sup.ListName.Length == 0) return 0;
        else if (String.valueOf(fav_sup.getCrateDate()).length()== 0) return 0;
        else
            return 1;
    }




}
