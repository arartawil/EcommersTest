package Ecommers.BL;

public class Products
{
    Ecommers.DL.Products DAL = new Ecommers.DL.Products();

    public int Add(Ecommers.Entity.Products pro)
    {
        if (Done(pro) == 0)
            return 0;
        else
            return DAL.insert(pro);
    }

    public int Reomve(int idmain,int idsub,int idsupp,int id)
    {
        return DAL.delete(idmain, idsub, idsupp, id);
    }

    public int Edit(Ecommers.Entity.Products pro)
    {


        return DAL.update(pro);
    }

    public int Done(Ecommers.Entity.Products pro)
    {
        if (String.valueOf(pro.getCategoryMainID()).length() == 0) return 0;
        else if (String.valueOf(pro.getCategorySubID()).length() == 0) return 0;
        else if (String.valueOf(pro.getSupplier_ID()).length() == 0) return 0;
        else if (String.valueOf(pro.getBranch_ID()).length() == 0) return 0;
        else if (pro.getProductDescription().length()==0) return 0;
        else if (String.valueOf(pro.getProductAvailableQuantity()).length() == 0) return 0;
        else if (String.valueOf(pro.getSaleUnit()).length() == 0) return 0;
        else if (String.valueOf(pro.getUnitPrice()).length() == 0) return 0;
        else if (String.valueOf(pro.getNegotiable()).length() == 0) return 0;
        else
            return 1;
    }
}
