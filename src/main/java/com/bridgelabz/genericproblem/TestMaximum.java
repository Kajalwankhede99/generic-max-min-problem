package com.bridgelabz.genericproblem;

public class TestMaximum
{
    public static void getMaxInteger(Integer[] arr) {

        int max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum integer is " + max+" and its position is "+position);
    }
    public static void main(String[] args) {
        Integer[] arr = {80, 30, 90};
        getMaxInteger(arr);
    }
}
