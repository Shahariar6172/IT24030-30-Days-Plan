import java.util.*;

// Student Management System work with List, Map, and Set
class Student {
    private int id;
    private String name;
    private List<String> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', courses=" + courses + "}";
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        // Map to store student ID -> Student object
        Map<Integer, Student> studentMap = new HashMap<>();

        // Set to store all unique courses offered
        Set<String> allCourses = new HashSet<>();

        // Creating students
        Student s1 = new Student(101, "Rahim");
        Student s2 = new Student(102, "Karim");
        Student s3 = new Student(103, "Sumi");

        // Enrolling courses
        s1.enrollCourse("Java");
        s1.enrollCourse("Math");

        s2.enrollCourse("Java");
        s2.enrollCourse("Physics");

        s3.enrollCourse("English");
        s3.enrollCourse("Math");

        // Adding students to Map
        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
        studentMap.put(s3.getId(), s3);

        // Collect all unique courses using Set
        for (Student s : studentMap.values()) {
            allCourses.addAll(s.getCourses());
        }

        // Display all students
        System.out.println("=== Student List ===");
        for (Student s : studentMap.values()) {
            System.out.println(s);
        }

        // Display all unique courses
        System.out.println("\n=== All Offered Courses ===");
        for (String course : allCourses) {
            System.out.println(course);
        }

        // Example: Search student by ID
        System.out.println("\n=== Search Result ===");
        int searchId = 102;
        if (studentMap.containsKey(searchId)) {
            System.out.println(studentMap.get(searchId));
        } else {
            System.out.println("Student not found!");
        }
    }
}