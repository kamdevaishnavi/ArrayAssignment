package com.brizz.assignarray;

public class DuplicateNumb {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 9, 6};
        System.out.println("duplicate values in given array :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j]);

                }
            }
        }
    }
}
