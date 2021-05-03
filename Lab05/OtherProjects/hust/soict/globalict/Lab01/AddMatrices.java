import java.util.Scanner;
public class AddMatrices {
    public static void add( int[][] m1, int[][] m2, int[][] m3, int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

    }
    public static void main(String[] args){
        int i,j,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n (n x n matrice): ");
        n = input.nextInt();
        int[][] A = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        int[][] B = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("B[" + i + "]["+ j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        int[][] C = new int[n][n];
        add(A,B,C,n);
        System.out.println("The matrix C is " + "\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {

                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
