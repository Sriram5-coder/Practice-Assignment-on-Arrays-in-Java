import java.util.Arrays;
import java.util.Scanner;

public class Ascending_descending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arrNum = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrNum[i] = scanner.nextInt();
        }
        scanner.close();

        // Sort the array in ascending order
        Arrays.sort(arrNum);
        System.out.println("The elements in ascending order: " + Arrays.toString(arrNum));

        // Sort the array in descending order
        for (int i = 0; i < size / 2; i++) {
            int temp = arrNum[i];
            arrNum[i] = arrNum[size - 1 - i];
            arrNum[size - 1 - i] = temp;
        }
        System.out.println("The elements in descending order: " + Arrays.toString(arrNum));
    }
}
