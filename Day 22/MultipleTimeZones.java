import java.time.ZonedDateTime;
import java.time.ZoneId;

public class MultipleTimeZones {
    public static void main(String[] args) {

        ZonedDateTime dhaka =
                ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));

        ZonedDateTime london =
                ZonedDateTime.now(ZoneId.of("Europe/London"));

        ZonedDateTime newYork =
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Dhaka Time: " + dhaka);
        System.out.println("London Time: " + london);
        System.out.println("New York Time: " + newYork);
    }
}