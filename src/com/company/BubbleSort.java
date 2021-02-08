package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
        int bubbleSort(int arr[], int n) {
            int loop = 0;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        loop++;
                    }
            return loop;
        }

        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the array size: ");
            int number = input.nextInt();
            Random rd = new Random();
            Instant start = Instant.now();
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt();
                System.out.println(array[i]);
            }
            BubbleSort ob = new BubbleSort();
            int loop = ob.bubbleSort(array, number);
            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(array));

            Instant finish = Instant.now();
            long time = Duration.between(start, finish).toMillis();

            System.out.println("That took " + time + " MILLIseconds.");
            System.out.println("Loop iterated: " + loop);
        }
    }
