import java.util.Scanner;

class solution
{
    void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}

class ans {
    public static void main(String args[]) {
        solution os = new solution();
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        os.table(n);
    }
}