package vehicle;

public abstract class vehicle {
    public String company_name;
    public float price;
    static int count = 1000;
    int id;

    vehicle(String name, float price){
        this.company_name = name;
        this.price = price;
        count+=1;
        id = count;
    }
}
