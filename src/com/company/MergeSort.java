package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
static int count=0;
    public static int merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        count++;
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        count++;
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return count;
    }

    // Main function that sorts arr[l..r] using
    // merge()
    int sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
            count++;
        }
        return count;
    }

    // Driver code
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int number = input.nextInt();
        Random rd = new Random();
        Instant start=Instant.now();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
            MergeSort ob = new MergeSort();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("Sorted array: " + Arrays.toString(arr));
        Instant finish=Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        System.out.println("That took " + timeElapsed + " MILLIseconds.");
        System.out.println("Iterations made: " + count);
        }
    }



