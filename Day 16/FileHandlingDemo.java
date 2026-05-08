import java.io.*;

//introduction to Java File Handling working with Creating a file,Writing into a file,Reading from a file

public class FileHandlingDemo {

    public static void main(String[] args) {

        String fileName = "example.txt";

        //  WRITE TO FILE
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello Java File Handling!\n");
            writer.write("This is a second line.\n");
            writer.write("File handling is easy in Java.");
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing file: " + e.getMessage());
        }

        //  READ FROM FILE
        try {
            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            System.out.println("\nReading file content:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}