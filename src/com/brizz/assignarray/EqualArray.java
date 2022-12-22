package com.brizz.assignarray;

public class EqualArray {
    public static void main(String[] args) {

        boolean flag = true;
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 2, 4, 5, 6};
        if(arr1.length == arr2.length){
            System.out.println("Arrays length is same ");

            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println("Arrays are equal ");
            }
            else
                System.out.println("Arrays are not equal ");
        }
        else
            System.out.println("Arrays are not equal ");
    }

}

