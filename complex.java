import java.util.*;
class complex {
    String b;
    void addition(int a1, int b1, int a2, int b2)
    {
        if(b1+b2 > 0)
        {
            b = "+";
        }
        else
        {
            b = "";
        }
        System.out.println((a1+a2) + b + (b1+b2) + "i" );       
    }
    void substruction(int a1, int b1, int a2, int b2)
    {
        if(b1-b2 > 0)
        {
            b = "+";
        }
        else
        {
            b = "";
        }
        System.out.println((a1-a2) + b + (b1 - b2) + "i");
    }
    void multiplication(int a1, int b1, int a2, int b2)
    {
        if( ((a1*b2)+(b1*a2)) > 0)
        {
            b = "+";
        }
        else
        {
            b = "";
        }
        System.out.println(((a1*a2)-(b1*b2)) + b + ((a1*b2)+(b1*a2)) + "i" );
    }
}

class execute1 {
    public static void main(String args[])
    {
        complex cp = new complex();
        int a1, b1, a2, b2, opt;
        System.out.println("Enter a1, b1, a2, b2 sequentially: ");
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        
        System.out.println("1.addition, 2.subs, 3.mul");
        opt = sc.nextInt();
        if(opt == 1)
        {
            cp.addition(a1, b1, a2, b2);
        }
        else if(opt == 2)
        {
            cp.substruction(a1, b1, a2, b2);
        }
        else if(opt == 3)
        {
            cp.multiplication(a1, b1, a2, b2);
        }
        else
        {
            System.out.println("Invalid choise");
        }
    }
}
