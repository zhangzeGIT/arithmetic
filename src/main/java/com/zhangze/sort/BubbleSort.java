package com.zhangze.sort;

/**
 * 冒泡排序：
 * 反复交换相邻的未按次序排列的元素，低效
 */
public class BubbleSort {
    public static Integer[] sort(Integer[] arr){
        Integer tmp = null;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1;j < arr.length;j++){
                if (arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
