package classroom;

public abstract class person {
    public String name, add1,mobilenumber;
    public int age;

    person(String name, String add1, int age, String mobilenumber)
    {
        this.name = name;
        this.add1 = add1;
        this.age = age;
        this.mobilenumber = mobilenumber;
    }
}
