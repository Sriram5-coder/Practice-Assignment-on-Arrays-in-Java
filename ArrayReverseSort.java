import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }
        sc.close();

        // Reverse the array
        for (int i = 0; i < arrNum.length / 2; i++) {
            int temp = arrNum[i];
            arrNum[i] = arrNum[arrNum.length - 1 - i];
            arrNum[arrNum.length - 1 - i] = temp;
        }

        System.out.println("The elements in reverse order:");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();

        // Sort the array in ascending order
        Arrays.sort(arrNum);
        System.out.println("The elements in ascending order:");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();

        // Sort the array in descending order
        for (int i = 0; i < arrNum.length / 2; i++) {
            int temp = arrNum[i];
            arrNum[i] = arrNum[arrNum.length - 1 - i];
            arrNum[arrNum.length - 1 - i] = temp;
        }
        System.out.println("The elements in descending order:");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
    }
}
