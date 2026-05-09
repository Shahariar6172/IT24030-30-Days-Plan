import java.io.File;

//Managing Directories in Java

public class DirectoryManagementExample {
public static void main(String[] args) {

        // Create a File object for directory
        File directory = new File("MyFolder");

        // Create directory
        if (directory.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Directory already exists or creation failed.");
        }

        // Create subdirectories
        File subDirectory = new File("MyFolder/SubFolder");

        if (subDirectory.mkdirs()) {
            System.out.println("Subdirectory created successfully.");
        } else {
            System.out.println("Subdirectory already exists or creation failed.");
        }

        // Check if directory exists
        if (directory.exists()) {
            System.out.println("Directory exists.");
        }

        // List files and folders
        String[] files = directory.list();

        System.out.println("\nContents of MyFolder:");

        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }

        // Delete subdirectory
        if (subDirectory.delete()) {
            System.out.println("\nSubdirectory deleted successfully.");
        } else {
            System.out.println("\nFailed to delete subdirectory.");
        }
    }
}