package com.bridgelabz.genericproblem;

public class TestMaximum
{
    public static void getMaxString(String[] arr) {

        String max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum string is " + max+" and its position is "+position);
    }

    public static <T extends Comparable<T>> void getMax(T[] arr) {
        T max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int a = arr[i].compareTo(max);
            if(a > 0)
            {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum element is " + max+" and its position is "+position);
    }
    public static void main(String[] args) {
        Integer[] arr = {80, 40, 90};
        getMax(arr);

        Float[] floatArr = {2.3f,4.2f,7.5f};
        getMax(floatArr);

        String[] stringArr = {"Apple", "Peach", "Banana"};
        getMax(stringArr);
    }
}
