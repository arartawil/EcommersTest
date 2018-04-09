package Ecommers.BL;



public class Category {
    Ecommers.DL.Category DAL = new Ecommers.DL.Category();


    public int add(Ecommers.Entity.Category cat)
    {
        if(done(cat)==0)return 0;
        else return DAL.insert(cat);
    }

    public int update(Ecommers.Entity.Category cat)
    {
        if(done(cat)==0)return 0;
        else return DAL.update(cat);
    }

    public int delete(int MainID,int SubID)
    {
       return DAL.delete(MainID,SubID);
    }

    public int done(Ecommers.Entity.Category cat)
    {
        if(String.valueOf(cat.getCategoryMainID()).length()==0) return 0;
        else if(String.valueOf(cat.getCategorySubID()).length()==0)return 0;
        else return 1;
    }
}
