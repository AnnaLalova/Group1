package com.company;



import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;




class Main {

    void shellSort(int array[], int n) {
        int loop = 0;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                     loop++;
                }
                array[j] = temp;
            }
        }
        System.out.println("Loop iterated: " + loop);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int number = input.nextInt();
        Random rd = new Random();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt();
            System.out.println(array[i]);
        }
        Main ss = new Main();
        ss.shellSort(array, number);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));


        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println("Execution time in nanoseconds : " + (endTime-startTime));
        }
}