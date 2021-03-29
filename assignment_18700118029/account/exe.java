package account;
import java.util.*;
public class exe {

    public static void main(String args[])
    {
        String name, Address_proof, PAN;
        int opt, acount_type, savingscount = 0, demartcount = 0, homeloancount = 0;
        Scanner sc = new Scanner(System.in); 
        saving arr[] = new saving[100];
        demart arr1[]= new demart[100];
        homeloan arr2[] = new homeloan[100];
        String type = "none";
        int position = -1;

        while(true){

            System.out.println("\n1)New Account\n2)Edit account\n0)EXIT\n");
            System.out.println("Enter option: ");opt = sc.nextInt();sc.nextLine();

            if(opt == 1)//entering data
            {
                System.out.println("Enter name: ");name = sc.nextLine();
                System.out.println("Enter address proof: ");Address_proof = sc.nextLine();
                System.out.println("Enter PAN: ");PAN = sc.nextLine();
                System.out.println("Enter type of account 1)savings 2)homeloan 3)demart ");acount_type = sc.nextInt();sc.nextLine();
                if(acount_type == 1)
                {
                    System.out.println("Enter initial deposit: ");
                    int i = sc.nextInt();sc.nextLine();
                    saving ob = new saving();
                    ob.name = name;
                    ob.Address_proof = Address_proof;
                    ob.PAN = PAN;
                    ob.add_banace(i);
                    arr[savingscount] = ob;
                    savingscount++; 
                    System.out.println("* Your id is: "+ ob.getaccno()+"\n");
                }
                else if(acount_type == 2)
                {
                    System.out.println("Enter colateral details: ");
                    String i = sc.nextLine();
                    homeloan ob = new homeloan();
                    ob.setcollataral(i);

                    ob.name = name;
                    ob.Address_proof = Address_proof;
                    ob.PAN = PAN;

                    arr2[homeloancount] = ob;
                    homeloancount++; 

                    System.out.println("* Your id is: "+ ob.getaccno()+"\n");

                }

                else if(acount_type == 3)
                {
                    System.out.println("Enter initial deposit: ");
                    int i = sc.nextInt();sc.nextLine();
                    demart ob = new demart();
                    ob.name = name;
                    ob.Address_proof = Address_proof;
                    ob.PAN = PAN;
                    ob.add_banace(i);
                    arr1[demartcount] = ob;
                    demartcount++; 

                    System.out.println("* Your id is: "+ ob.getaccno()+"\n");

                }
            }

            if(opt == 2)//finding and updating data
            {
                System.out.println("Enter id to edit: ");
                int id = sc.nextInt();sc.nextLine();
                int flag = 1;

                for(int i=0;i<savingscount;i++)
                {
                    if (arr[i].getaccno() == id)
                    {
                        flag = 0;
                        type = "savings";
                        position = i;
                        break;
                    }
                }

                if(flag == 1)
                {
                    for(int i=0;i<homeloancount;i++)
                    {
                        if (arr2[i].getaccno() == id)
                        {
                            flag = 0;
                            type = "home";
                            position = i;
                            break;
                        }
                    }
                }

                if(flag == 1)
                {
                    for(int i=0;i<demartcount;i++)
                    {
                        if (arr1[i].getaccno() == id)
                        {
                            flag = 0;
                            type = "demart";
                            position = i;
                            break;
                        }
                    }
                }

                if(flag == 1){
                    System.out.println("Account not found\n");
                }

                else{
                    while(true)
                    {   
                        int edit;
                        System.out.println("Account found: ");
                        if(type == "savings")
                        {
                            System.out.println(arr[position].getaccno()+"\n"+arr[position].name+"\n"+arr[position].get_balance()+"\nSavings account\n");
                            System.out.println("\n1 ) add balance\n2 ) deduct balance\n3 ) View balance\nanyother int to go to previous menu\nchoose");
                            edit = sc.nextInt();sc.nextLine();
                            if(edit == 1)
                            {
                                System.out.println("Amount: ");
                                int b = sc.nextInt();sc.nextLine();
                                arr[position].add_banace(b);
                            }

                            else if(edit == 2)
                            {
                                System.out.println("deduct balance: ");
                                int b = sc.nextInt();sc.nextLine();
                                arr[position].deduct_amount(b);
                            }

                            else if(edit == 3)
                            {
                                System.out.println("\n\nID: "+arr[position].getaccno()+"\nBalance: "+arr[position].get_balance()+"\n");
                            }
                            else{
                                break;
                            }
                        }
                        else if(type == "home")
                        {
                            System.out.println(arr2[position].getaccno()+"\n"+arr2[position].name+"\n"+arr2[position].get_balance()+"\nhomeloan account\n");
                            System.out.println("\n1 ) add balance\n2 ) deduct yearly\n3 ) View balance\nanyother int to go to previous menu\nchoose");
                            edit = sc.nextInt();sc.nextLine();
                            if(edit == 1)
                            {
                                System.out.println("Amount: ");
                                int b = sc.nextInt();sc.nextLine();
                                arr2[position].add_banace(b);
                            }

                            if(edit == 2)
                            {
                                System.out.println("Deduct yearly: ");
                                arr2[position].cut_money();
                            }

                            else if(edit == 3)
                            {
                                System.out.println("\n\nID: "+arr2[position].getaccno()+"\nBalance: "+arr2[position].get_balance()+"\n");
                            }
                            else{
                                break;
                            }
                        }
                        else if(type == "demart")
                        {
                            System.out.println(arr1[position].getaccno()+"\n"+arr1[position].name+"\n"+arr1[position].get_balance()+"\ndemart account\n");
                            System.out.println("\n1 ) buy share\n2 ) sell share\n3 ) View balance\nanyother int to go to previous menu\nchoose");
                            edit = sc.nextInt();sc.nextLine();
                            if(edit == 1)
                            {   
                                System.out.println("Brought share amount: ");
                                float b = sc.nextFloat();sc.nextLine();
                                arr1[position].buy_share(b);
                            }
                            else if(edit == 2)
                            {
                                System.out.println("Sell share amount: ");
                                float b = sc.nextFloat();sc.nextLine();
                                arr1[position].sell_share(b);
                            }
                            else if(edit == 3)
                            {
                                System.out.println("\n\nID: "+arr1[position].getaccno()+"\nBalance: "+arr1[position].get_balance()+"\n");
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
            }
            if(opt == 0)
            {
                System.out.println("EXIT\n");
                break;
            }
        }
    }
}
