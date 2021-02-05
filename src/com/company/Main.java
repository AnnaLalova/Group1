package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int number=input.nextInt();
        //System.out.println("Enter the array size: " + number);
        Random rd=new Random();
        int[] array=new int[number];
        for (int i=0; i<array.length;i++) {
            array[i] = rd.nextInt();
            System.out.println(array[i]);
        }

    }
}