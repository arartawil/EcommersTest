package Ecommers.Entity;

public class Order
{
    private int Order_ID ;
    private int item_Counter ;
    private String  Order_Date ;
    private int Suppliers_ID ;
    private String Branch_ID ;
    private int Customer_ID ;
    private int ProductID ;
    private int Quantity_Ordered ;
    private String saleUnit;
    private float UnitPrice ;
    private float discount_percentage ;
    private float Totle_price ;
    private float Net_Price ;
    private String Order_Processed_By ;
    private String Order_State ;


    public Order()
    {

    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int order_ID) {
        Order_ID = order_ID;
    }

    public int getItem_Counter() {
        return item_Counter;
    }

    public void setItem_Counter(int item_Counter) {
        this.item_Counter = item_Counter;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String order_Date) {
        Order_Date = order_Date;
    }

    public int getSuppliers_ID() {
        return Suppliers_ID;
    }

    public void setSuppliers_ID(int suppliers_ID) {
        Suppliers_ID = suppliers_ID;
    }

    public String getBranch_ID() {
        return Branch_ID;
    }

    public void setBranch_ID(String branch_ID) {
        Branch_ID = branch_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getQuantity_Ordered() {
        return Quantity_Ordered;
    }

    public void setQuantity_Ordered(int quantity_Ordered) {
        Quantity_Ordered = quantity_Ordered;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        UnitPrice = unitPrice;
    }

    public float getDiscount_percentage() {
        return discount_percentage;
    }

    public void setDiscount_percentage(float discount_percentage) {
        this.discount_percentage = discount_percentage;
    }

    public float getTotle_price() {
        return Totle_price;
    }

    public void setTotle_price(float totle_price) {
        Totle_price = totle_price;
    }

    public float getNet_Price() {
        return Net_Price;
    }

    public void setNet_Price(float net_Price) {
        Net_Price = net_Price;
    }

    public String getOrder_Processed_By() {
        return Order_Processed_By;
    }

    public void setOrder_Processed_By(String order_Processed_By) {
        Order_Processed_By = order_Processed_By;
    }

    public String getOrder_State() {
        return Order_State;
    }

    public void setOrder_State(String order_State) {
        Order_State = order_State;
    }
}
