package vehicle;
import java.util.*;

public class exe {
    public static void main(String args[])
    {
        String name;
        float price,capacity_in_ton,milage;
        int type,n,i=0,j=0;
        heavy_motor arrh[] = new heavy_motor[100];
        light_motor arrl[] = new light_motor[100];

        try(Scanner sc= new Scanner(System.in);){

            System.out.println("Enter number of inputs: ");
            n = sc.nextInt();
            sc.nextLine();

            while(n > 0)
            {
                System.out.println("Enter company name: ");
                name = sc.nextLine();
                
                System.out.println("Enter price: ");
                price = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Enter vehicle type\n1)Light\n2)Heavy: ");
                type = sc.nextInt();
                sc.nextLine();
                
                if(type == 1)
                {
                    System.out.println("Milage: ");
                    milage = sc.nextFloat();
                    sc.nextLine();
                    arrl[i] = new light_motor(name, price, milage);
                    i++;
                }
                else if(type == 2)
                {
                    System.out.println("Capacity in ton: ");
                    capacity_in_ton = sc.nextFloat();
                    sc.nextLine();
                    arrh[j] = new heavy_motor(name, price, capacity_in_ton);
                    j++;
                }
                else
                {
                    System.out.println("Invalid input.");
                }
                n--;
                
            }
        }
        for(int l = 0;l<i;l++){
            System.out.println("\n\nid: "+arrl[l].id+"\ncompany name: "+arrl[l].company_name+"\nprice: "+arrl[l].price+"\nmilage: "+arrl[l].milage);
        }
        for(int l=0 ; l<j ; l++){
            System.out.println("\n\nid: "+arrh[l].id+"\ncompany name: "+arrh[l].company_name+"\nprice: "+arrh[l].price+"\ncapacity in tons: "+arrh[l].capacity_in_ton);
        }
    }
}
