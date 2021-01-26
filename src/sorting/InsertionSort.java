package sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {

        int n = arr.length;

        int [] sortArr = new int[n];
        for (int i = 0; i < n; i++) sortArr[i] = arr[i];

        for (int i = 1; i < n; i++) {
            final int currentValue = sortArr[i];
            int j = i - 1;

            while (j >= 0 && sortArr[j] > currentValue) {
                sortArr[j + 1] = sortArr[j];
                j--;
            }
            sortArr[j + 1] = currentValue;
        }

        return sortArr;

    }

}
