import java.util.Scanner;

public class primecomposite {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n = sc.nextInt();
        int i, j,count;
        for (i = 1; i <= n; i++) {
count=0;

            for (j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
                }

                if (count == 2)
                    System.out.println(i + "");

        }


    }
}
