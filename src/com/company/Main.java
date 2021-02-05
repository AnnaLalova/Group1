package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;




    class ShellSort {
        void shellSort(int array[], int n) {
            for (int interval = n / 2; interval > 0; interval /= 2) {
                for (int i = interval; i < n; i += 1) {
                    int temp = array[i];
                    int j;
                    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                        array[j] = array[j - interval];
                    }
                    array[j] = temp;
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the array size: ");
            int number = input.nextInt();
            //System.out.println("Enter the array size: " + number);
            Random rd = new Random();
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt();
                System.out.println(array[i]);
            }
            ShellSort ss = new ShellSort();
            ss.shellSort(array, number);
            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(array));

                long startTime = System.nanoTime();
               Thread.sleep(5000);
                long endTime = System.nanoTime();
                //System.out.println("That took " + TimeUnit.MILLISECONDS.toSeconds((endTime-startTime)) + " seconds.");
            System.out.println("Execution time in nanoseconds : " + (endTime-startTime));
            }
            }





