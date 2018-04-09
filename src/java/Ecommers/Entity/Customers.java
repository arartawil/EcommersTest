package Ecommers.Entity;

public class Customers
{
    private  int Customer_ID;
    private  String Customer_Name;
    private String Customer_Phone ;
    private String Customer_Address ;
    private  String Customer_ZipCode ;
    private  String Customer_BillingAddress ;
    private String Customer_Email;
    private  String Comments ;
    private int isASupplier ;
    private  String User_ID ;
    private String username;
    private String User_passsword ;
    private String CreateData ;
    private  int flag;


    public Customers()
    {

    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getCustomer_Phone() {
        return Customer_Phone;
    }

    public void setCustomer_Phone(String customer_Phone) {
        Customer_Phone = customer_Phone;
    }

    public String getCustomer_Address() {
        return Customer_Address;
    }

    public void setCustomer_Address(String customer_Address) {
        Customer_Address = customer_Address;
    }

    public String getCustomer_ZipCode() {
        return Customer_ZipCode;
    }

    public void setCustomer_ZipCode(String customer_ZipCode) {
        Customer_ZipCode = customer_ZipCode;
    }

    public String getCustomer_BillingAddress() {
        return Customer_BillingAddress;
    }

    public void setCustomer_BillingAddress(String customer_BillingAddress) {
        Customer_BillingAddress = customer_BillingAddress;
    }

    public String getCustomer_Email() {
        return Customer_Email;
    }

    public void setCustomer_Email(String customer_Email) {
        Customer_Email = customer_Email;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public int getIsASupplier() {
        return isASupplier;
    }

    public void setIsASupplier(int isASupplier) {
        this.isASupplier = isASupplier;
    }

    public String getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(String  user_ID) {
        User_ID = user_ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_passsword() {
        return User_passsword;
    }

    public void setUser_passsword(String user_passsword) {
        User_passsword = user_passsword;
    }

    public String getCreateData() {
        return CreateData;
    }

    public void setCreateData(String createData) {
        CreateData = createData;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
