package sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int[] a1;
        int[] a2;

        int n = arr.length;
        int mid = n / 2;

        if (n % 2 == 0) {
            a1 = new int[mid];
        } else {
            a1 = new int[mid + 1];
        }
        a2 = new int[mid];

        int i;
        for (i = 0; i < a1.length; i++) {
            a1[i] = arr[i];
        }
        int k = 0;
        for (int j = i; j < arr.length; j++) {
            a2[k] = arr[j];
            k++;
        }

        return merge(mergeSort(a1), mergeSort(a2));

    }

    private static int[] merge(int[] a1, int[] a2) {

        int i = 0;
        int j = 0;

        int n = a1.length + a2.length;
        int[] sortArr = new int[n];

        for (int k = 0; k < n; k++) {
            if (a1[i] < a2[j]) {
                sortArr[k] = a1[i];
                i++;
            } else {
                sortArr[k] = a2[j];
                j++;
            }
            if (i == a1.length) {
                k++;
                for (j = j; j < a2.length; j++){
                    sortArr[k] = a2[j];
                    k++;
                }
                break;
            }
            if (j == a2.length) {
                k++;
                for (i = i; i < a1.length; i++){
                    sortArr[k] = a1[i];
                    k++;
                }
                break;
            }

        }
        return sortArr;
    }

}
