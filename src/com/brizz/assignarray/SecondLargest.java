package com.brizz.assignarray;

public class SecondLargest {
    public static void main(String[] args) {
        int temp;
        int[] arr = {22, 54, 34, 76, 33, 89};
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("second largest number:" +arr[1]);
    }
}
