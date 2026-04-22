//creating a class
public class person {
    //private attributes
    private String name;
    private int age;
    //constructor
    public person(String name,int age) {
        this.name=name;
        this.age=age;
    
    }
    //public method to get the name
    public String getName() {
        return name;
    }

    //public method to set the name 
    public void setName(String name) {
        this.name=name;

    }
    //public method to get the age
    public int getAge() {
        return age;
    }
    //public method to set the age 
    public void setAge(int age) {
        if(age>=0) { //simple validation
            this.age=age;
        }
        else{
            System.out.println("Age can't be negative");
        }
    }
}