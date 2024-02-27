import java.util.Scanner;

public class multiplicationtable {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; ++i) {
            System.out.println(String.format("%d x %d = %d",n,i,n*i));
//            System.out.println("" + n + " x " + i + "= " + n * i);
    }
}
}
