package Ecommers.Entity;

public class Fav_Suppliers
{
    private int Customer_ID;
    private int Suppliers_ID;
    private int List_Counter;
    private String ListName ;
    private String  CrateDate;
    private int publicorprivate;
    private int Status;


    public Fav_Suppliers()
    {

    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getSuppliers_ID() {
        return Suppliers_ID;
    }

    public void setSuppliers_ID(int suppliers_ID) {
        Suppliers_ID = suppliers_ID;
    }

    public int getList_Counter() {
        return List_Counter;
    }

    public void setList_Counter(int list_Counter) {
        List_Counter = list_Counter;
    }

    public String getListName() {
        return ListName;
    }

    public void setListName(String listName) {
        ListName = listName;
    }

    public String getCrateDate() {
        return CrateDate;
    }

    public void setCrateDate(String crateDate) {
        CrateDate = crateDate;
    }

    public int getPublicorprivate() {
        return publicorprivate;
    }

    public void setPublicorprivate(int publicorprivate) {
        this.publicorprivate = publicorprivate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
