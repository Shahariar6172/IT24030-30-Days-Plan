import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Working with File Input and Output Streams in Java

public class FileIOStreamExample {
public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {

            int data;

            // Read and write byte by byte
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}