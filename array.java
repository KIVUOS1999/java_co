public class array {
    void display(int p[][])
    {
        int i, j;
        for(i=0;i<p.length;i++)
        {
            for(j=0;j<p[i].length;j++)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    void display1(int p[][])
    {
        for(int i=0;i<p.length;i++)
        {
            int temp = p[0][i];
            p[0][i] = p[2][i];
            p[2][i] = temp;
        }
        array ob = new array();
        ob.display(p);
    }

    public static void main(String args[])
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        array ob = new array();
        ob.display(a);
        System.out.println("\n");
        ob.display1(a);
    }
}
