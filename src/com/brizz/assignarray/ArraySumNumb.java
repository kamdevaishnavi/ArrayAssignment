package com.brizz.assignarray;

public class ArraySumNumb {
    public static void main(String args []) {
        int [] numArr = {2, 7, 8, 6, 57, 34, 22};
        int sum = 0;
        int i;
        for (i = 0; i < numArr.length - 1; i++)
        {
            sum = sum + numArr[i];

            }
        System.out.println("sum of all the elements of an array:" + sum);
    }
}

