package com.company;

import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;


    class ShellSort {
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
            System.out.println("Loops iterated: " + loop);
        }

        public static void main(String[] args) throws InterruptedException {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the array size: ");
            int number = input.nextInt();
            Random rd = new Random();
            Instant start=Instant.now();
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt();
                System.out.println(array[i]);
            }
            ShellSort ss=new ShellSort();
            ss.shellSort(array, number);
            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(array));
Instant finish=Instant.now();
long timeElapsed = Duration.between(start,finish).toMillis();
            System.out.println("That took " + timeElapsed + " MILLIseconds.");

        }
    }




