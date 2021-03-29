package account;

public class homeloan extends account{
    private String collatatal_details;
    private float interest = 4;

    public void setcollataral(String data)
    {
        collatatal_details = data;
    }

    public String getcollateral()
    {
        return collatatal_details;
    }

    public void cut_money(){
        float a = get_balance()*interest/100;
        update_balance(get_balance() - a);
    }
}
