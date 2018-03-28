package com.zhangze.sort;

/**
 * 插入排序：原址排序
 * 类似于扑克牌，从数组的第二个作为key，依次与key之前的数据进行比较
 * 如果key小，则将比较的数据向后移一位
 */
public class InsertSort {
    public static Integer[] sort(Integer[] arr){
        for (int i = 1;i < arr.length;i++){
            Integer key = arr[i];
            Integer j = i - 1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
