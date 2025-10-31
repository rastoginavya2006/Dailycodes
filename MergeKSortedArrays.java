import java.util.*;

public class MergeKSortedArrays{

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) merged[k++] = arr1[i++];
        while (j < arr2.length) merged[k++] = arr2[j++];

        return merged;
    }

    public static int[] mergeKSortedArrays(int[][] arrays) {
        if (arrays == null || arrays.length == 0) return new int[0];
        int last = arrays.length - 1;

        while (last != 0) {
            int i = 0, j = last;

            while (i < j) {
                arrays[i] = mergeTwoArrays(arrays[i], arrays[j]);
                i++;
                j--;

                if (i >= j)
                    last = j;
            }
        }
        return arrays[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of arrays (k): ");
        int k = sc.nextInt();

        int[][] arrays = new int[k][];

        for (int i = 0; i < k; i++) {
            System.out.print("Enter size of array " + (i + 1) + ": ");
            int size = sc.nextInt();

            arrays[i] = new int[size];
            System.out.println("Enter " + size + " sorted elements for array " + (i + 1) + ":");

            for (int j = 0; j < size; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        int[] mergedArray = mergeKSortedArrays(arrays);

        System.out.println("\nMerged Sorted Array: " + Arrays.toString(mergedArray));

        sc.close();
    }
}
