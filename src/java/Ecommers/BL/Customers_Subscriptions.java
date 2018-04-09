package Ecommers.BL;

public class Customers_Subscriptions
{
    Ecommers.DL.Customers_Subscriptions DAL = new Ecommers.DL.Customers_Subscriptions();
    public int Add(Ecommers.Entity.Customers_Subscriptions cussub)
    {
        if (Done(cussub) == 0)
            return 0;
        else
            return DAL.insert(cussub);
    }

    public int Edit(Ecommers.Entity.Customers_Subscriptions cussub)
    {
        if (Done(cussub) == 0)
            return 0;
        else
            return DAL.update(cussub);
    }
    public int Reomve(int id)
    {
        return DAL.delete(id);
    }

    public int Done(Ecommers.Entity.Customers_Subscriptions cussub)
    {
        if (String.valueOf(cussub.getCustomer_ID()).length() == 0) return 0;
        else if (String.valueOf(cussub.getSubscription_Counter()).length() == 0) return 0;
        else if (cussub.getSubscription_Level().length() == 0) return 0;
        else if (String.valueOf(cussub.getSubscription_Date()).length() == 0) return 0;
        else if (String.valueOf(cussub.getAmount_Paid()).length() == 0) return 0;
        else if (String.valueOf(cussub.getPayment_Method()).length() == 0) return 0;
        else if (String.valueOf(cussub.getPayment_ID()).length() == 0) return 0;
        else if (String.valueOf(cussub.getExp_Code()).length()== 0) return 0;
        else if (String.valueOf(cussub.getSVC_code()).length() == 0) return 0;
        else if (String.valueOf(cussub.getName_On_Card()).length() == 0) return 0;
        else if (String.valueOf(cussub.getSubscripton_valid_Unitl()).length() == 0) return 0;
        else if (cussub.getSubscrition_Status().length() == 0) return 0;
        else if (String.valueOf(cussub.getExp_Date()).length() == 0) return 0;
        else return 1;
    }
}
