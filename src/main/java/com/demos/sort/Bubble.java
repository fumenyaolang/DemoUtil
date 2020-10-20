package com.demos.sort;

/**
 * @description: 冒泡排序
 * @author: fmyl
 * @create: 2020-10-19 18:09
 */
public class Bubble {

    public static int[] sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 100, 2, 4, 80, 55, 0};
        arr = sort(arr);
        System.out.println("~~~~~~~~~~~");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
