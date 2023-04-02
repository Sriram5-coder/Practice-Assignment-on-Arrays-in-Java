import java.util.*;

public class ArraySubset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the super set array: ");
        int n = input.nextInt();
        int[] arrSuperSet = new int[n];
        System.out.print("Enter the elements of the super set array: ");
        for (int i = 0; i < n; i++) {
            arrSuperSet[i] = input.nextInt();
        }

        System.out.print("Enter the number of elements in the subset array: ");
        int m = input.nextInt();
        int[] arrSubSet = new int[m];
        System.out.print("Enter the elements of the subset array: ");
        for (int i = 0; i < m; i++) {
            arrSubSet[i] = input.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arrSuperSet[i];
            if (freqMap.containsKey(key)) {
                freqMap.put(key, freqMap.get(key) + 1);
            } else {
                freqMap.put(key, 1);
            }
        }

        System.out.println("Frequencies of elements from the subset array in the super set array:");
        for (int i = 0; i < m; i++) {
            int key = arrSubSet[i];
            if (freqMap.containsKey(key)) {
                System.out.println("Frequency of " + key + ": " + freqMap.get(key));
            } else {
                System.out.println("Frequency of " + key + ": 0");
            }
        }
    }
}
