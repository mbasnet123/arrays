package com.Manish;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(45);
//        list.add(64);
//        list.add(455);
//        list.add(435);
//        list.add(405);
//        list.add(45);
//        list.add(64);
//        list.add(455);
//        list.add(435);
//        list.add(405);
//        list.add(45);
//        list.add(64);
//        list.add(455);
//        list.add(435);
//        list.add(405);

//        System.out.println(list.contains(6334));

//        System.out.println(list);
//        list.set(0,766);
//
//        list.remove(3);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index]
            // syntax wont work here
        }
        System.out.println(list);
    }
}
