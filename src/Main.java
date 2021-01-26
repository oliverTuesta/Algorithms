import sorting.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] data = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        QuickSort.quickSort(data, 0 , data.length-1);

        for (int i : data){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
