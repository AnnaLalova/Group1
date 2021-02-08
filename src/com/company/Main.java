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
        }}

        public static long startTime = System.nanoTime();

        public static void mergeSort(int[] a, int n) {
            if (n < 2)
                return;
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = a[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = a[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(a, l, r, mid, n - mid);
        }

        //In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.
        public static void merge(int[] a, int[] l, int[] r, int left, int right) {

            int i = 0, j = 0, k = 0;

            while (i < left && j < right) {

                if (l[i] <= r[j])
                    a[k++] = l[i++];
                else
                    a[k++] = r[j++];
            }
            while (i < left)
                a[k++] = l[i++];

            while (j < right)
                a[k++] = r[j++];

            long stopTime = System.nanoTime();
            long elapsedTime = stopTime - startTime;
            double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;
            {
                System.out.println("That took " + (elapsedTimeInSecond) + " seconds");
            }
        }}
