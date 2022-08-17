package com.Manish;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 333, 4, 3, 99};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2,4) );


    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end) {

//        //edge cases
//        if (end < start){
//            return -1;
//        }
//
//        if (arr == null) {
//            return -1;
//        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
