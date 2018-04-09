package Ecommers.Entity;

public class Customers_Subscriptions
{
    private int Customer_ID ;
    private int Subscription_Counter;
    private String Subscription_Level;
    private String Subscription_Date;
    private float Amount_Paid ;
    private String Payment_Method ;
    private String Payment_ID ;
    private String Exp_Code;
    private String SVC_code ;
    private String Name_On_Card;
    private String Subscripton_valid_Unitl;//date
    private String subscrition_Status ;
    private String Comment ;
    private String Exp_Date ;

    public Customers_Subscriptions()
    {
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getSubscription_Counter() {
        return Subscription_Counter;
    }

    public void setSubscription_Counter(int subscription_Counter) {
        Subscription_Counter = subscription_Counter;
    }

    public String getSubscription_Level() {
        return Subscription_Level;
    }

    public void setSubscription_Level(String subscription_Level) {
        Subscription_Level = subscription_Level;
    }

    public String getSubscription_Date() {
        return Subscription_Date;
    }

    public void setSubscription_Date(String subscription_Date) {
        Subscription_Date = subscription_Date;
    }

    public float getAmount_Paid() {
        return Amount_Paid;
    }

    public void setAmount_Paid(float amount_Paid) {
        Amount_Paid = amount_Paid;
    }

    public String getPayment_Method() {
        return Payment_Method;
    }

    public void setPayment_Method(String payment_Method) {
        Payment_Method = payment_Method;
    }

    public String getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(String payment_ID) {
        Payment_ID = payment_ID;
    }

    public String getExp_Code() {
        return Exp_Code;
    }

    public void setExp_Code(String exp_Code) {
        Exp_Code = exp_Code;
    }

    public String getSVC_code() {
        return SVC_code;
    }

    public void setSVC_code(String SVC_code) {
        this.SVC_code = SVC_code;
    }

    public String getName_On_Card() {
        return Name_On_Card;
    }

    public void setName_On_Card(String name_On_Card) {
        Name_On_Card = name_On_Card;
    }

    public String getSubscripton_valid_Unitl() {
        return Subscripton_valid_Unitl;
    }

    public void setSubscripton_valid_Unitl(String subscripton_valid_Unitl) {
        Subscripton_valid_Unitl = subscripton_valid_Unitl;
    }

    public String getSubscrition_Status() {
        return subscrition_Status;
    }

    public void setSubscrition_Status(String subscrition_Status) {
        this.subscrition_Status = subscrition_Status;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getExp_Date() {
        return Exp_Date;
    }

    public void setExp_Date(String exp_Date) {
        Exp_Date = exp_Date;
    }
}
