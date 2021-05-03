import java.util.Scanner;
public class SortArray {
    public static void main(String[] args){
        int n, sum = 0;
        float average;
        Scanner input = new Scanner(System.in);
        System.out.print("Size of array = ");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = input.nextInt();
            sum = sum + a[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}
