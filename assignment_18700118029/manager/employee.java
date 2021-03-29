package manager;

public class employee {
    private String name, department; private float salary;
    private static int count = 0;
    private int id;

    employee(String name, String department, float salary)
    {
        this.name = name;
        this.department = department;
        this.salary = salary;
        count++;
        id = count;
    }

    public void display_identity()
    {
        System.out.println("\nid: "+id+"\nname: "+name+"\ndepartment: "+department+"\nsalary: "+salary);
    }

    public float getsalary(){
        return this.salary;
    }

    public int getid(){
        return this.id;
    }
}
