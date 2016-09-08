/**
 * Created by saniddha on 8/17/16.
 */
public class PublicStatic {
    public static String firstName;
    public String lastName;

    public static String getFullName(String name) {

        return name+firstName;
    }

    public String addString(String t){
        return t+"########";
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
