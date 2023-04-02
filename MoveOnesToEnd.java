import java.util.Scanner;

public class MoveOnesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }
        sc.close();

        int countOnes = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] == 1) {
                countOnes++;
            }
        }

        int index = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] != 1) {
                arrNum[index++] = arrNum[i];
            }
        }

        while (countOnes > 0) {
            arrNum[index++] = 1;
            countOnes--;
        }

        System.out.print("Array elements after moving Ones to end: ");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
    }
}
