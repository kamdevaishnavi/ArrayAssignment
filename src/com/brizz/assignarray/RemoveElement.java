package com.brizz.assignarray;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int place;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array lenght : ");
        int size = scanner.nextInt()

         int [] arr = new int[size];
        System.out.println("Enter array value : ");
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter array location : ");
        place = scanner.nextInt();
        for (int i = place; i < size -1; i++){
            arr[i] = arr[i + 1];
        }
        System.out.println();
        size--;
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]+ " ");
        }

    }
}
