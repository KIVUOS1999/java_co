package classroom;

public class teacher extends person {
    public static int count1 = 0;
    private int teacher_id;
    public int no_of_classes;
    public String subject_teacher; 

    teacher(String name, String add1, int age, String mobilenumber, int no_of_classes, String subject_teacher) {
        super(name, add1, age, mobilenumber);
        count1++;
        teacher_id = count1;
        this.no_of_classes = no_of_classes;
        this.subject_teacher = subject_teacher;
    }

    public void display()
    {
        System.out.println("\nStudent name: "+name+"\nid: "+teacher_id+"\naddress: "+add1+"\nage: "+age+"\nmobilenumber: "+mobilenumber+"\nno of classes: "+no_of_classes+"\nAssigned Subject: "+subject_teacher+"\n\n");
    }
}
