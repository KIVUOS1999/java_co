package account;

public class saving extends account{
    void deduct_amount(int money)
    {
        if(get_balance() - money >= 0)
        {
            update_balance(get_balance() - money);
        }
        else
        {
            System.out.println("Not enough money. ");
        }
    }
}
