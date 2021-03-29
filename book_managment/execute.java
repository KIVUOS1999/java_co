package book_managment;

import java.util.Scanner;

public class execute {
    public static void main(String args[])
    {
        int flag=0, i, j=0; //i will keep track of present entry j will traverse in present entry.
        book arr[] = new book[100]; 
        Scanner sc = new Scanner(System.in);

        System.out.println("how many book you want to take as input: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter book title");
            String book_title = sc.nextLine();
            for(j=0;j<i;j++)
            {
                if(i==0)
                {
                    break;
                }
                flag = 0;
                if(book_title.compareTo(arr[j].name) == 0)
                {
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0)// item not found.
            {
                System.out.println("Enter book author");
                String book_author = sc.nextLine();
                System.out.println("Enter book price");
                int book_price = sc.nextInt();
                sc.nextLine();
                arr[i] = new book(book_title, book_author, book_price);
            }
            
            else{
                System.out.println("***Book is already present.***");
                arr[i] = new book(arr[j]);
            }
            
        }
        sc.close();
        System.out.println("\n---------Data inserted---------");
        for(i=0;i<n;i++)
        {
            System.out.println("\n"+(i+1)+"*\n"+arr[i].name+"\n"+arr[i].author+"\n"+arr[i].price+"\n");
        }
    }
}
