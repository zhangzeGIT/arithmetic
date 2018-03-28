package com.zhangze.sort;

/**
 * 归并排序：分治法，不是原址排序
 * 数组中只有一个元素，那么必为排好序的数组
 * ①比较两个已经排好序的数组
 * ②将两个数组合并成一个新的排好序的数组
 *
 * 代价：每层引起的代价为cn（遍历比较大小），一共logN层，所以代价为θ(nlogN)
 */
public class MergeSort {
    public static Integer[] sort(Integer[] arr){
        recursion(arr, 0 ,arr.length-1);
        return arr;
    }
    private static void recursion(Integer[] arr,int begin,int end){
        if (begin < end){
            int middle = ((begin + end)/2);
            recursion(arr, begin, middle);
            recursion(arr,middle+1, end);
            sortAfterRecursion(arr, begin, middle, end);
        }
    }
    /**
     * 给一个数组，begin到middle已经排好序，middle+1到end已经排好序
     * 新建两个数组，将两个排好序的数组装进去，通过这两个数组，对原数组进行排序
     */
    private static void sortAfterRecursion(Integer[] arr, int begin, int middle, int end){
        int n1 = middle - begin + 1;
        int n2 = end - middle;
        Integer[] arr1 = new Integer[n1+1];
        Integer[] arr2 = new Integer[n2+1];
        for (int i = 0; i < n1; i++ ){
            arr1[i] = arr[begin + i];
        }
        arr1[n1] = Integer.MAX_VALUE;
        for (int i = 0 ;i < n2; i++){
            arr2[i] = arr[middle + i + 1];
        }
        arr2[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = begin;k <= end; k++){
            if (i < n1 && arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else if (j < n2){
                arr[k] = arr2[j];
                j++;
            }
        }
    }
}
