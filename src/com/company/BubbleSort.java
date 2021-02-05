package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
    void bubbleMain(int array[], int n) {
        int loop = 0;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    loop++;
                }
        System.out.println("Loop iterated: " + loop);

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        BubbleSort ob = new BubbleSort();
        int number = input.nextInt();
        Random rd = new Random();
        int[] array = new int[number];
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
        BubbleSort ss = new BubbleSort();
        ob.bubbleMain(array, number);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorted array");

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println("Execution time in nanoseconds : " + (endTime-startTime));
    }
}
