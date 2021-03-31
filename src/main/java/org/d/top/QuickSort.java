package org.d.top;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int [] array = new int[] {4,1,10,8,1000,12,32};
        partitionInternal(array,0,6);
        System.out.println("array="+ Arrays.toString(array));
    }

    private static void partitionInternal(int [] array,int begin,int end){
        if(begin >= end){
            return ;
        }

        int q= partition(array,begin,end);
        partition(array,begin,q-1);
        partition(array,q+1,end);
    }
    private static int partition(int [] array,int begin,int end){
        int pivot = array[begin];
        int index = begin;
        for(int i= begin+1;i<=end;i++){
            if(array[i] < pivot){
                index ++;
                int arrayValue = array[index];
                array[index] = array[i];
                array[i] = arrayValue;
            }
        }

        array[begin] = array[index];
        array[index] = pivot;
        return  index;
    }
}
