package Ecommers.BL;

public class Suppliers
{
    Ecommers.DL.Suppliers DAL = new Ecommers.DL.Suppliers();

    public int Add(Ecommers.Entity.Suppliers sup)
    {

        return DAL.insert(sup);
    }

    public int Edit(Ecommers.Entity.Suppliers sup)
    {

        return DAL.update(sup);
    }
    public int remove(int ID)
    {
        return DAL.delete(ID);
    }
}
