import java.time.LocalDate;
//Introduction to Java Date and Time Classes

public class CurrentDateExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Current Date: " + today);
    }
}