/**
 * Created by saniddha on 8/22/16.
 */
public class SubscriberDetails {
    private String msisdn;
    private String userType;
    private String userName;
    private String balanceAmount;
    private String date;
    private String pin;

//    public SubscriberDetails(String msisdn, String userType, String userName, String balanceAmount, String date, String pin) {
//        this.msisdn = msisdn;
//        this.userType = userType;
//        this.userName = userName;
//        this.balanceAmount = balanceAmount;
//        this.date = date;
//        this.pin = pin;
//    }
    public static class Builder{

    private final String msisdn;
    private final String userName;

    private String userType;
    private String balanceAmount;
    private String date;
    private String pin;

    public Builder(String userName,String msisdn){
        this.msisdn=msisdn;
        this.userName=userName;
    }
    public Builder balance(String b){
        balanceAmount= b;
        return this;
    }

    public Builder type(String t){
        userType= t;
        return this;
    }
    public Builder date(String d){
        date= d;
        return this;
    }
    public Builder pin(String p){
        pin= p;
        return this;
    }

    public SubscriberDetails build(){
        return new SubscriberDetails(this);
    }
}



    private SubscriberDetails(Builder builder) {

        this.pin=builder.pin;
        this.date = builder.date;
        this.balanceAmount = builder.balanceAmount;
        this.userType = builder.userType;
    }
}