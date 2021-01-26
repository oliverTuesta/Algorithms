package sorting;

public class BubbleSort {

    public void bubbleSort(int[] arr) {

        final int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            for (int y : arr){
                System.out.print(y+" ");
            }
            System.out.println();

        }


    }

    private void swap(int[] arr, int i1, int i2) {
        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];
    }


}
