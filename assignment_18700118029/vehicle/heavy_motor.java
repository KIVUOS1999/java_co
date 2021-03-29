package vehicle;

public class heavy_motor extends vehicle {

    public float capacity_in_ton;

    heavy_motor(String name, float price, float capacity_in_ton) {
        super(name, price);
        this.capacity_in_ton = capacity_in_ton;
    }
    
}
