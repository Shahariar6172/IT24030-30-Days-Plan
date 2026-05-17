import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Parsing Dates from Strings in Java

public class ParseDateExample {
    public static void main(String[] args) {

        String dateString = "17-05-2026";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date =
                LocalDate.parse(dateString, formatter);

        System.out.println("Parsed Date: " + date);
    }
}