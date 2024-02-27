import java.util.Scanner;

public class smallestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("" + a + " is smallest");
        } else if (b < a && b < c) {
            System.out.println("" + b + " is smallest");
        } else {
            System.out.println("" + c + " is smallest");
        }

    }
}
