package algorithms.sorting;

import java.util.Arrays;

public class SortingExample {

    public static void main(String[] args) {

        int []arr= new int[1000];


        for (int i=0;i<arr.length; i++){
            arr[i]=(int)(Math.random()*1000);
        }

        var temp = Arrays.copyOf(arr,arr.length);
        long start, end;

        start  = System.currentTimeMillis();
        MergeSort.sort(arr);
        end = System.currentTimeMillis();
        System.out.println("Time Taken Merge Sort : "+(end-start));

        start  = System.currentTimeMillis();
        Arrays.sort(arr);
        end = System.currentTimeMillis();
        System.out.println("Time Taken Quick Sort : "+(end-start));

    }

}
