package account;

public class demart extends account{

    public void buy_share(float amount)
    {
        update_balance(get_balance() - amount);
        
    }

    public void sell_share(float amount)
    {
        update_balance(amount+ get_balance());
    }
}
