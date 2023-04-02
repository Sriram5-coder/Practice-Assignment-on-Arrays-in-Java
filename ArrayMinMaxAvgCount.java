import java.util.Scanner;

public class ArrayMinMaxAvgCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }
        sc.close();

        int min_val = arrNum[0];
        int max_val = arrNum[0];
        int sum_val = 0;
        for (int i = 0; i < n; i++) {
            if (arrNum[i] < min_val) {
                min_val = arrNum[i];
            }
            if (arrNum[i] > max_val) {
                max_val = arrNum[i];
            }
            sum_val += arrNum[i];
        }

        double avg_val = (double) sum_val / n;
        System.out.println("The element with the Minimum value: " + min_val);
        System.out.println("The element with the Maximum value: " + max_val);
        System.out.println("Average of all array elements: " + avg_val);
        System.out.println("Total number of array elements: " + n);
    }
}
