import java.util.Scanner;

public class Triangle {
    public static void Triagle(int n)
    {
        for (int i=0; i<n; i++){
            for (int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("n = ");

        n = input.nextInt();
        Triagle(n);
    }
}
