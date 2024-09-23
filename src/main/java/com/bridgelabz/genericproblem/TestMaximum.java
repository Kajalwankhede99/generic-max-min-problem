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

    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        getMax(10,40,20);
        System.out.println("Maximum integer is "+getMax(10,40,20));
        getMax(2.3f,4.2f,7.5f);
        System.out.println("Maximum float is "+getMax(2.3f,4.2f,7.5f));
        getMax("Apple", "Peach", "Banana");
        System.out.println("Maximum string is "+getMax("Apple", "Peach", "Banana"));
    }
}
