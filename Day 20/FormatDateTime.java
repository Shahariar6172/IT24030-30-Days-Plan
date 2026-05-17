import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = now.format(format);

        System.out.println("Formatted Date: " + formattedDate);
    }
}