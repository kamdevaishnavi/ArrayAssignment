package com.brizz.assignarray;

public class SumAvgVal {
    public static void main(String[] args) {
        int[] numArr = {22, 67, 56, 33};
        int sum = 0;
        int i;
        int lenght = numArr.length;
        for (i = 0; i < numArr.length; i++)
        {
            sum += numArr [i];
        }
        double avg = sum / lenght;

        System.out.println("avg of array : " + avg);
    }
}
