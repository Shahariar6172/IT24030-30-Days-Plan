import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String result = now.format(formatter);

        System.out.println("Formatted Date and Time: " + result);
    }
}