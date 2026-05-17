import java.time.ZonedDateTime;
import java.time.ZoneId;

//Using Time Zones in Java

public class TimeZoneExample {
    public static void main(String[] args) {

        ZonedDateTime dateTime =
                ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));

        System.out.println("Date and Time: " + dateTime);
    }
}