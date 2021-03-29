package manager;

public class manager extends employee{

    private float bonus;

    manager(String name, String department, float salary, float bonus) 
    {
        super(name, department, salary);
        this.bonus = bonus;
    }

    public float getbonus(){
        return bonus;
    }
    
    public void display()
    {
        System.out.println("Bonus: "+bonus);
    }
}
