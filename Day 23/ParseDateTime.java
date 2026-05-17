import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseDateTime {
    public static void main(String[] args) {

        String dateTimeString =
                "17-05-2026 14:30:25";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy HH:mm:ss");

        LocalDateTime dateTime =
                LocalDateTime.parse(
                        dateTimeString, formatter);

        System.out.println("Parsed Date-Time: " + dateTime);
    }
}