//using the person class
public class Main {
    public static void main(String [] args) {
        //create a new person object
        person person= new person("Babu",20);
        //accessing the name using getter
        System.out.println("Name:"+person.getName());
        //accessing the age using getter
        System.out.println("Age:"+person.getAge());
        //modifying the properties using setters
        person.setName("Bob");
        person.setAge(25);
        //displaying updet information
        System.out.println("updated Name:"+ person.getName());
        System.out.println("updated Age:"+ person.getAge());
        //trying to set a nagetive age
        person.setAge(-5); //this will trigger validation message
    
    }
}