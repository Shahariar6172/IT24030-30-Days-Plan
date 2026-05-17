import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseTimeExample {
    public static void main(String[] args) {

        String timeString = "10:30:45";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time =
                LocalTime.parse(timeString, formatter);

        System.out.println("Parsed Time: " + time);
    }
}