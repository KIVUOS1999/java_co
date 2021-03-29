package classroom;

public class student extends person {

    public static int count = 0;
    private int roll;
    public int no_of_subjects, standard;

    student(String name, String add1, int age, String mobilenumber, int no_of_student, int standard) {
        super(name, add1, age, mobilenumber);    
        count++;
        roll = count;
        this.no_of_subjects = no_of_student;
        this.standard = standard;
    }

    public void display()
    {
        System.out.println("\nStudent name: "+name+"\nroll no: "+roll+"\naddress: "+add1+"\nage: "+age+"\nmobilenumber: "+mobilenumber+"\nno of subjects: "+no_of_subjects+"\nclass: "+standard+"\n\n");
    }
}
