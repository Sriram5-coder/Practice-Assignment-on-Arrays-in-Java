import java.util.Scanner;

public class LargestPrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }
        sc.close();

        int maxPrime = Integer.MIN_VALUE;
        for (int i = 0; i < arrNum.length; i++) {
            if (isPrime(arrNum[i]) && arrNum[i] > maxPrime) {
                maxPrime = arrNum[i];
            }
        }

        if (maxPrime == Integer.MIN_VALUE) {
            System.out.println("There is no prime number in the given array");
        } else {
            System.out.println("The Largest Prime number in given array: " + maxPrime);
        }
    }
}
