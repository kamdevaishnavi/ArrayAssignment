package com.brizz.assignarray;

public class FindMaxMinArr {
    public static void main(String[] args) {
        int array[] = {10, 12, 15, 20, 30, 40, 18, 14};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            }
            System.out.println("maximum number" + max);
            for (int i = 0; i < array.length; i++){
                if (array[i] < min)
                    min = array[i];
            }
            System.out.println("minimum value" + min);
        }

    }







