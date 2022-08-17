package com.Manish;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        //array of primitives
//        int[] arr = new int[5];
//        arr[0] = 65;
//        arr[1] = 76;
//        arr[2] = 43;
//        arr[3] = 83;
//        arr[4] = 64;
//        System.out.println(arr[3]);

//        //input using for loops
//        for (int i =0;i < arr.length; ++i){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for(int i=0;i < arr.length;++i){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num: arr){
//            // for every element in array, print the element
//            System.out.println(num + "");
//            // here num represents element of the array

//        }

//        System.out.println(arr[5]); // index out of bound error

        // array of objects
        String[] str = new String[4];
        for (int i = 0; 1 < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Manish";

        System.out.println(Arrays.toString(str));
    }
}
