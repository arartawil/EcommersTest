package Ecommers.Entity;

public class Category
{
    private int CategoryMainID;
    private int CategorySubID;
    private String CategoryName;
    private String CategoryImage;
    private String CategoryDesc;
    private int Flag;
    private int SupplierID;

    public Category()
    {

    }

    public int getCategoryMainID() {
        return CategoryMainID;
    }

    public void setCategoryMainID(int categoryMainID) {
        CategoryMainID = categoryMainID;
    }

    public int getCategorySubID() {
        return CategorySubID;
    }

    public void setCategorySubID(int categorySubID) {
        CategorySubID = categorySubID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryImage() {
        return CategoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        CategoryImage = categoryImage;
    }

    public String getCategoryDesc() {
        return CategoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        CategoryDesc = categoryDesc;
    }

    public int getFlag() {
        return Flag;
    }

    public void setFlag(int flag) {
        Flag = flag;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }
}
