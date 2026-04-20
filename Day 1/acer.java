public class acer{
    public static void main(String [] args) {
        StudentData s1= new StudentData();
        StudentData s2= new StudentData();
        s1.name="santo";
        s1.id="10";
        s2.name="kabir";
        s2.id="20";
        s1.Standup();
        s2.Standup();
        s1.Showdetails();
        System.out.println("=======");
        s2.Showdetails();
        
    }
}