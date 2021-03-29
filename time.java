import java.util.*;
public class time {
    int convention_hrs;
    String dd_P;
    time(int hrs, int minutes)
    {
        if(hrs > 12 && hrs<24)
        {
            convention_hrs = hrs-12;
            dd_P = "PM";
        }
        else if(hrs < 12 && hrs > 0){
            convention_hrs = hrs;
            dd_P = "AM";
        }
        else if(hrs == 0){
            convention_hrs = 12;
            dd_P = "AM";
        }
        else if(hrs == 12){
            convention_hrs = 12;
            dd_P = "PM";
        }
        else{
            System.out.println("invalid input");
        }
        if(hrs>=0 && hrs<=23)
        {
            System.out.println("Time is: "+convention_hrs+" : "+minutes+" "+dd_P);
        }
    }
}

class execute{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in format(hh:mmxx or hh:mm)");
        String data = sc.nextLine();
        int l = data.length();
        if(l==5){
            String d_hrs = data.substring(0, 2);
            String d_min = data.substring(3,5);
            time ob = new time(Integer.parseInt(d_hrs), Integer.parseInt(d_min));
        }

        else if(l==7)
        {
            System.out.println(data);
        }

        else{
            System.out.println("Please check the format");
        }
    }
}
