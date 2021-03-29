package arrayofob;

public class b {
    public static void main(String args[])
    {
        a ob[] = new a[3];//creatnig

        ob[0] = new a();
        ob[0].data(1,2);
        
        ob[1] = new a();
        ob[1].data(5,6);

        ob[2] = new a();
        ob[2].data(ob[0].a + ob[1].a, ob[0].b + ob[1].b);

        ob[0].display();
        System.out.println("\n");
        ob[1].display();
        System.out.println("\n");
        ob[2].display();
    }
}
