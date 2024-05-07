package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {



    public static void main(String[] args) {
        int []arr= new int[100000];

        for (int i=0;i<arr.length; i++){
            arr[i]=(int)(Math.random()*1000);
        }

        long time1 = System.currentTimeMillis();
        Arrays.sort(arr);

//        sort(arr);

        long time2 = System.currentTimeMillis();
        System.out.println("Time Taken : "+(time2-time1));
//        for(int element:arr) {
//            System.out.print(element+"    ");
//        }
    }

    public static void sort(int []inputArr) {
        mergeSort(inputArr,0,inputArr.length-1);
    }

    public static void mergeSort(int[] inputArr, int start, int end) {
        if(end<=start) {
            return;
        }

        int mid=(start+end)/2;
        mergeSort(inputArr,start,mid);
        mergeSort(inputArr, mid+1,end);

        merge(inputArr, start, mid, end);

    }


    public static void merge(int[] inputArr, int start, int mid, int end) {

        int[] tempArray=new int[(end-start)+1];

        int leftSlot=start;
        int rightSlot=mid+1;
        int k=0;

        while(leftSlot<=mid && rightSlot<=end) {
            if(inputArr[leftSlot]<inputArr[rightSlot]) {
                tempArray[k]=inputArr[leftSlot];
                leftSlot++;
            }
            else {
                tempArray[k]=inputArr[rightSlot];
                rightSlot++;
            }
            k++;

        }


        while(leftSlot<=mid) {
            tempArray[k]=inputArr[leftSlot];
            leftSlot++;
            k++;
        }


        while(rightSlot<=end) {
            tempArray[k]=inputArr[rightSlot];
            rightSlot++;
            k++;
        }


        for(int i=0; i<tempArray.length; i++) {
            inputArr[start+i]=tempArray[i];
        }

    }


}
