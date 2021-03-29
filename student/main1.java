package student;
import java.util.Scanner;

public class main1 {
    public static void main(String args[])
    {
        String name,course;
        int n,i,roll,opt,opt1;
        float m1,m2,m3,m4,m5;
        subject arr[] = new subject[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students: ");
        n = sc.nextInt();
        sc.nextLine();

        //Inputing data
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name: "); name = sc.nextLine();
            System.out.println("Enter course: "); course = sc.nextLine();
            System.out.println("Enter roll: "); roll = sc.nextInt();sc.nextLine();

            System.out.println("Enter marks of 5 subject: ");
            m1 = sc.nextFloat();sc.nextLine();
            m2 = sc.nextFloat();sc.nextLine();
            m3 = sc.nextFloat();sc.nextLine();
            m4 = sc.nextFloat();sc.nextLine();
            m5 = sc.nextFloat();sc.nextLine();

            arr[i] = new subject(roll, name, course, m1, m2,m3,m4,m5);
        }

        for(int j=0;j<n;j++)
        {
            System.out.println("name: "+arr[j].name+"\ncourse: "+arr[j].course+"\nroll: "+arr[j].roll+"\nsub1: "+arr[j].m1+"\nsub2: "+arr[j].m2+"\nsub3: "+arr[j].m3+"\nsub4: "+arr[j].m4+"\nsub5: "+arr[j].m5+"\n");
        }
        //Output of data
        
        while(true)
        {
            System.out.println("\n1. add, delete and modify information of any student,\n2. calculate subject wise average of marks\n3. calculate student wise average of marks\n0. Quit\n\n");
            System.out.println("Enter choise: ");
            opt = sc.nextInt();sc.nextLine();

            if(opt == 1){
                System.out.println("1.Add\n2.Delete\n3.Modify\nEnter choise : ");
                opt1 = sc.nextInt();sc.nextLine();
                if(opt1 == 1)
                {
                    System.out.println("Add");
                    System.out.println("Enter name: "); name = sc.nextLine();
                    System.out.println("Enter course: "); course = sc.nextLine();
                    System.out.println("Enter roll: "); roll = sc.nextInt();sc.nextLine();

                    System.out.println("Enter marks of 5 subject: ");
                    m1 = sc.nextFloat();sc.nextLine();
                    m2 = sc.nextFloat();sc.nextLine();
                    m3 = sc.nextFloat();sc.nextLine();
                    m4 = sc.nextFloat();sc.nextLine();
                    m5 = sc.nextFloat();sc.nextLine();

                    arr[i] = new subject(roll, name, course, m1, m2,m3,m4,m5); 
                    i+=1;
                    for(int j = 0; j<i; j++)
                    {
                        System.out.println("name: "+arr[j].name+"\ncourse: "+arr[j].course+"\nroll: "+arr[j].roll+"\nsub1: "+arr[j].m1+"\nsub2: "+arr[j].m2+"\nsub3: "+arr[j].m3+"\nsub4: "+arr[j].m4+"\nsub5: "+arr[j].m5);
                    }
                }

                else if(opt1 == 2) //delete
                {
                    int flag = 0, find, m;
                    System.out.println("Delete");
                    System.out.println("Enter roll: ");int r = sc.nextInt();sc.nextLine();
                    
                    for(find = 0; find<i; find++)
                    {
                        if(arr[find].roll == r)
                        {
                            flag = 1;
                            break;
                        }
                    }

                    if(flag == 0)
                    {
                        System.out.println("Student doesnot exist.");
                    }
                    else{
                        System.out.println("Roll no found.\n");
                        if(find!=i-1)
                        {
                            for(m = find; m<i-1; m++)
                            {
                                arr[m] = arr[m+1];                            
                            }
                        }
                    }
                    if(flag == 1)
                    {
                        i = i -1;
                    }

                    for(int j=0;j<i;j++)
                    {
                        System.out.println("name: "+arr[j].name+"\ncourse: "+arr[j].course+"\nroll: "+arr[j].roll+"\nsub1: "+arr[j].m1+"\nsub2: "+arr[j].m2+"\nsub3: "+arr[j].m3+"\nsub4: "+arr[j].m4+"\nsub5: "+arr[j].m5);
                    }
                }

                else if(opt1 == 3)
                {
                    System.out.println("Modify");
                    System.out.println("Enter roll: ");int r = sc.nextInt();sc.nextLine();
                    for(int find =0 ;find<i;find++)
                    {
                        if(arr[find].roll == r)
                        {
                            System.out.println("1 Change name\n2 change course\n3 change sub1\n4 change sub2\n5 change sub3\n6 change sub4\n7 change sub5\n");
                            int choise = sc.nextInt();sc.nextLine();
                            if(choise == 1)
                            {
                                arr[find].name = sc.nextLine();
                            }
                            else if(choise == 2)
                            {   
                                arr[find].course = sc.nextLine();
                            }
                            else if(choise == 3)
                            {
                                arr[find].m1 = sc.nextInt();sc.nextLine();
                            }
                            else if(choise == 4)
                            {
                                arr[find].m2 = sc.nextInt();sc.nextLine();
                            }
                            else if(choise == 5)
                            {
                                arr[find].m3 = sc.nextInt();sc.nextLine();
                            }
                            else if(choise == 6)
                            {
                                arr[find].m4 = sc.nextInt();sc.nextLine();
                            }
                            else if(choise == 7)
                            {
                                arr[find].m5 = sc.nextInt();sc.nextLine();
                            }
                            break;
                        }
                    }
                    for(int j=0;j<i;j++)
                    {
                        System.out.println("name: "+arr[j].name+"\ncourse: "+arr[j].course+"\nroll: "+arr[j].roll+"\nsub1: "+arr[j].m1+"\nsub2: "+arr[j].m2+"\nsub3: "+arr[j].m3+"\nsub4: "+arr[j].m4+"\nsub5: "+arr[j].m5);
                    }
                }
            }
            else if(opt == 2){
                System.out.println("Calculate subject wise avarage");
                System.out.println("Enter subject number such as 1 for m1: ");
                int r = sc.nextInt();sc.nextLine();
                float s = 0;
                
                for(int find = 0; find<i;find++)
                {
                    if(r==1)
                    {
                        s+=arr[find].m1;
                    }
                    else if(r==2)
                    {
                        s+=arr[find].m2;
                    }
                    else if(r==3)
                    {
                        s+=arr[find].m3;
                    }
                    else if(r==4)
                    {
                        s+=arr[find].m4;
                    }
                    else if(r==5)
                    {
                        s+=arr[find].m5;
                    }
                }

                System.out.println("Subject wise avarage is: "+(s/i));
            }
            else if(opt == 3)
            {
                System.out.println("Student wise avarage marks: ");
                System.out.println("Enter student roll: ");
                int r = sc.nextInt();sc.nextLine();
                for(int find = 0; find<i;find++)
                {
                    if(arr[find].roll == r)
                    {
                        subject c = arr[find];
                        System.out.println("Avarage marks of student: "+((c.m1+c.m2+c.m3+c.m4+c.m5)/5));
                        break;
                    }
                }
            }
            else if(opt == 0)
            {
                System.out.println("\n\nEXIT");
                break;
            }
            else{
                System.out.println("wrong input: ");
            }
        }
        
    }
}
