package classroom;
import java.util.*;

public class exe {
    public static void main(String args[])
    {
        int n,age, opt, no_of_classes,no_of_subject,std,teacher_count = 0,student_count = 0;
        String name,add, subject_teacher, mobile;
        student arr[] = new student[100];
        teacher arr1[] = new teacher[100];

        try(Scanner sc = new Scanner(System.in);)
        {
            System.out.println("Enter no of inputs: ");n=sc.nextInt();sc.nextLine();
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter name: ");name = sc.nextLine();
                System.out.println("Enter address: ");add = sc.nextLine();
                System.out.println("Enter age: ");age = sc.nextInt();sc.nextLine();
                System.out.println("Enter mobile number: ");mobile = sc.nextLine();

                System.out.println("candidatee is:\n1) Teacher\n2) Student");
                opt = sc.nextInt();sc.nextLine();
                if (opt == 1)
                {
                    System.out.println("Enter subject: ");subject_teacher = sc.nextLine(); 
                    System.out.println("Enter number of classes: ");no_of_classes = sc.nextInt();sc.nextLine();
                    arr1[teacher_count] = new teacher(name, add, age, mobile, no_of_classes, subject_teacher);
                    teacher_count++;
                }
                else if(opt == 2)
                {
                    System.out.println("Enter number of subjects: ");no_of_subject = sc.nextInt();sc.nextLine();
                    System.out.println("Enter class: ");std = sc.nextInt();sc.nextLine();
                    arr[student_count] = new student(name, add, age, mobile, no_of_subject, std);
                    student_count++;
                }
                else{
                    System.out.println("wrong input: ");
                }
            }
        }
        System.out.println("---STUDENT---\n");
        for(int i=0;i<student_count;i++)
        {
            arr[i].display();
        }
        System.out.println("----TEACHER----\n");
        for(int i=0;i<teacher_count;i++)
        {
            arr1[i].display();
        }
    }    
}
