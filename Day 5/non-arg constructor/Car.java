public class Car {
    String model;
    int year;
    //Non-arg constructor
    Car() {
        model= "Default model";
        year =2026;
    }
   void display() {
    System.out.println("car model:"+model+",Year:"+year);
   }
}