package org.d.top;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9,2,4,6,8};
        arr = bubbleSort(arr);
        System.out.println("arr="+ Arrays.toString(arr));
    }

    private static int[] bubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
