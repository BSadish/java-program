import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three nubers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("a>b&&a>c is " + (a > b && a > c));
        System.out.println("a>b||a>c is " + (a > b || a > c));
        System.out.println("!(a>b) is " + (a <= b));
    }
}
