/**
 *
 * Created by saniddha on 8/17/16.
 */
public class main {

    public static void main(String[] args ){
        System.out.println("testing");
        String test = PublicStatic.getFullName("sanidha");
        System.out.println(test);

        SubscriberDetails subscriberDetails = new SubscriberDetails.Builder("saniddha","0717367997").balance("100").date("today")
                .pin("6793").type("prepaid").build();
        System.out.println(subscriberDetails);
    }

}
