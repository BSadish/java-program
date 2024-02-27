import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter order of matrix");
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println("Enter matrix element");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nDisplaying elements of matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
