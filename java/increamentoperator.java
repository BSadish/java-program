import java.util.Scanner;

public class increamentoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a=" + a + "  b=" + b);
        ++a;
        System.out.println("a=" + a + "  b=" + b--);
        System.out.println("a=" + a + "  b=" + b);
    }
}
