package sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){

        final int n = arr.length;

        for (int i = 0; i < n -1; i++){

            int indexMinorNumber = i;

            for (int j = i + 1; j < n; j++){
                if(arr[indexMinorNumber] > arr[j]){
                    indexMinorNumber = j;
                }
            }
            if (indexMinorNumber!=i){
                swap(arr, i, indexMinorNumber);
            }
        }
        return arr;

    }

    private static void swap (int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] =  temp;
    }

}
