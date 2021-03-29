import java.util.*;
public class class1 {

    String name;
    String roll;
    String marks1;
    String marks2;

    public void input_data(){
        Scanner ob = new Scanner(System.in);
        name = ob.nextLine();
        roll = ob.nextLine();
        marks1 = ob.nextLine();
        marks2 = ob.nextLine();

    }
    public void output_data(){
        System.out.println("Name: "+name+"\nRoll: "+roll+"\nPhysics: "+marks1+"\nMaths: "+marks2);
    }

    public static void main(String args[])
    {
        class1 ob1 = new class1();
        ob1.input_data();
        ob1.output_data();
    }
}
