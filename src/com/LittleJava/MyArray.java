package com.LittleJava;

import java.util.Arrays;

public class MyArray {

    static int[] array = new int[20];
    static int index = 0;

    public static int add(int val) {
        array[index++] = val;
        return val;
    }

    public static int max() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void sort () {
        Arrays.sort(array);
    }

    public static int[] output () {
        return array;
    }

    public static int length () {
        return array.length;
    }

}
