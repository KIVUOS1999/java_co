class A{
    int id, number;
    A(int id, int number){
        this.id = id;
        this.number = number;
        System.out.println("We are in a");
    }
}

class B extends A{

    B()
    {
        super(21, 30);
        System.out.println("We are in b");
    }

    void gg()
    {
        B ob1 = new B();
        System.out.println(ob1.id);
    }    
}

class inheritance
{
    public static void main(String args[])
    {
        B ob = new B();
        ob.gg();
    }
}