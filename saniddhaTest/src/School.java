/**
 * Created by saniddha on 8/17/16.
 */
public class School extends PublicStatic{

    public static String schoolName;
    private static String sclLocation;

    public static String getSchoolName() {
        return schoolName;
    }

    public static String getSclLocation() {
        return sclLocation;
    }

    public static void setSchoolName(String schoolName) {
        School.schoolName = schoolName;
    }

    public static void setSclLocation(String sclLocation) {
        School.sclLocation = sclLocation;
    }
}
