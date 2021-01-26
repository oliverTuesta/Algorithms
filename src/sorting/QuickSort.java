package sorting;

public class QuickSort {

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int left = low;
        int right = high;

        while (true){
            while (arr[left]<pivot){
                left++;
            }//Se ejecuta este bucla hasta encontrar a un valor de left que deba estar en right

            while (arr[right]>pivot){
                right--;
            }//Se ejecuta este bucla hasta encontrar a un valor de right que deba estar en left

            if (left>=right){//si se cruzan o se encuentran devuelve la posición en la que esta pivot
                return right;
            }else{
                swap(arr, left, right);
            }

        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temporal = arr[i];
        arr[i] = arr[j];
        arr[j] = temporal;

    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex);
            quickSort(arr, partitionIndex + 1, high);

        }

    }

}
