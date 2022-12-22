package com.brizz.assignarray;

public class RevArrNumb {
    public static void main(String[] args) {
        int[] numArr = {2, 3, 6, 5, 8, 3};
        System.out.println("original array");
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i] + " ");
        }
        System.out.println("Array in reverse order");
        for (int i = numArr.length - 1; i < 0; i--) {
            System.out.println(numArr[i] + " ");

        }
    }

}
