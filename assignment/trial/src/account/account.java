package account;

public abstract class account {
    public static int count = 0;
    private int acc_no;
    public String name, Address_proof, PAN;
    private float balance;    

    public float get_balance(){
        return balance;
    }

    public void add_banace(int money){
        balance+=money;
    }

    public void update_balance(float new_money){
        this.balance = new_money;
    }

    public int getaccno()
    {
        return acc_no;
    }
    account()
    {
        count++;
        acc_no = count;
    }
}