package Ecommers.Entity;

public class Suppliers
{
    private int supplier ;
    private String name ;
    private String Image ;
    private String  subsctption_Date ;
    private String Account_Number ;
    private String TAX_ID;
    private String Commercial_Name;
    private String Manager_Name ;
    private String Phone ;
    private String Fax ;
    private String  CreateDate ;
    private String Primary_Billing_Address;
    private String Comment ;
    private int flag ;


    public Suppliers()
    {

    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getSubsctption_Date() {
        return subsctption_Date;
    }

    public void setSubsctption_Date(String subsctption_Date) {
        this.subsctption_Date = subsctption_Date;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(String account_Number) {
        Account_Number = account_Number;
    }

    public String getTAX_ID() {
        return TAX_ID;
    }

    public void setTAX_ID(String TAX_ID) {
        this.TAX_ID = TAX_ID;
    }

    public String getCommercial_Name() {
        return Commercial_Name;
    }

    public void setCommercial_Name(String commercial_Name) {
        Commercial_Name = commercial_Name;
    }

    public String getManager_Name() {
        return Manager_Name;
    }

    public void setManager_Name(String manager_Name) {
        Manager_Name = manager_Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getPrimary_Billing_Address() {
        return Primary_Billing_Address;
    }

    public void setPrimary_Billing_Address(String primary_Billing_Address) {
        Primary_Billing_Address = primary_Billing_Address;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
