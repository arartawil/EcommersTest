package Ecommers.BL;

public class Order
{


    Ecommers.DL.Order DAL = new Ecommers.DL.Order();
    public int Add(Ecommers.Entity.Order order)
    {

        return DAL.insert(order);

    }

    public int remove(int IDorder,int idsupplier,int idCustomer)
    {
        return DAL.delete(IDorder, idsupplier, idCustomer);
    }

}
