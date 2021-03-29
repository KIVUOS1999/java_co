package manager;

import java.util.*;
public class exe {
    public static void main(String args[])
    {
        int n, temp;
        String name, department;
        float salary, bonus;
        manager arr[] = new manager[100];

        try(Scanner sc = new Scanner(System.in);){
            
            System.out.println("Enter number of input: ");n = sc.nextInt();sc.nextLine();
            temp = n;
            while(n>0)
            {
                System.out.println("Enter name: ");name = sc.nextLine();
                System.out.println("Enter department: ");department =sc.nextLine();
                System.out.println("Enter salary: ");salary = sc.nextFloat();sc.nextLine();
                System.out.println("Enter bonus: ");bonus = sc.nextFloat();sc.nextLine();

                arr[n-1] = new manager(name, department, salary, bonus);
                n--;
            }
            float maxx = arr[0].getsalary() + arr[0].getbonus();
            int maxx_id = 0;
            for(int i=0;i<temp;i++)
            {
                if(arr[i].getsalary() + arr[i].getbonus() > maxx)
                {
                    maxx = arr[i].getsalary() + arr[i].getbonus();
                    maxx_id = i;
                }
            }
            System.out.println("\n\nMAXIMUM SALARY:");
            arr[maxx_id].display_identity();
            arr[maxx_id].display();
        }
    }
}
