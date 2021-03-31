package org.d.top;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] array = new int[] {4,1,10,8,1000,12,32};
        sort(array,0,6);
        System.out.println("array="+ Arrays.toString(array));
    }

    private static void sort(int [] array,int left,int right){
        if( left >= right){
            return;
        }

        int mid = (left+right)/2;
        sort(array,left,mid);
        sort(array,mid+1,right);
        merge(array,left,mid,right);
    }

    private static void merge(int [] array,int left,int mid,int right){
        int [] temp = new int [right-left+1];
        int p1 = left;
        int p2 = mid +1;
        int i = 0;
        while (p1 <= mid && p2 <= right){
            temp[i++] = array[p1]<array[p2]?array[p1++]:array[p2++];
        }

        while (p1 <= mid){
            temp[i++] = array[p1++];
        }

        while (p2 <= right){
            temp[i++] = array[p2++];
        }

        for (i=0;i<temp.length;i++){
            array[left+i] = temp[i];
        }
    }


}
