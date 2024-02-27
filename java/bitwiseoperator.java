import java.util.Scanner;
public class bitwiseoperator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("a&b= " +(a&b));
        System.out.println("a|b=" + (a | b));
        System.out.println("a<<2=" + (a << 2));
        System.out.println("b>>1=" + (b >> 1));
    }
}
