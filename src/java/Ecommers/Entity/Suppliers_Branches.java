package Ecommers.Entity;

public class Suppliers_Branches
{
    private int suppliers_ID ;
    private String Branch_ID ;
    private String Branch_NickName;
    private String Image;
    private int Status;
    private String Email;
    private int type;
    private int Delivery;
    private String CreateDate;
    private String Address;
    private String ZipCode;
    private String Phones;
    private  int flag;

    public Suppliers_Branches()
    {

    }

    public int getSuppliers_ID() {
        return suppliers_ID;
    }

    public void setSuppliers_ID(int suppliers_ID) {
        this.suppliers_ID = suppliers_ID;
    }

    public String getBranch_ID() {
        return Branch_ID;
    }

    public void setBranch_ID(String branch_ID) {
        Branch_ID = branch_ID;
    }

    public String getBranch_NickName() {
        return Branch_NickName;
    }

    public void setBranch_NickName(String branch_NickName) {
        Branch_NickName = branch_NickName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDelivery() {
        return Delivery;
    }

    public void setDelivery(int delivery) {
        Delivery = delivery;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getPhones() {
        return Phones;
    }

    public void setPhones(String phones) {
        Phones = phones;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
