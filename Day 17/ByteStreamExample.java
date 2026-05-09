import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Copy Data from One File to Another

public class ByteStreamExample {
public static void main(String[] args) {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {

            // Open input file
            inputStream = new FileInputStream("input.txt");

            // Open output file
            outputStream = new FileOutputStream("output.txt");

            int data;

            // Read byte by byte
            while ((data = inputStream.read()) != -1) {

                // Write byte to output file
                outputStream.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            try {

                // Close streams
                if (inputStream != null) {
                    inputStream.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }

            } catch (IOException e) {

                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}