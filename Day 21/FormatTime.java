import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedTime = time.format(formatter);

        System.out.println("Formatted Time: " + formattedTime);
    }
}