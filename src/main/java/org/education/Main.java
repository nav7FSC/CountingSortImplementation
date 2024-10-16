package org.education;

import java.util.ArrayList;
import java.util.Random;

/**
 * The Main class demonstrates the implementation of the Counting Sort algorithm.
 * It includes methods to display an array, perform counting sort, and compare results
 * between an array and an ArrayList.
 */
public class Main {

    /**
     * Displays the elements of an array on a single line, separated by spaces.
     *
     * @param a the array to be displayed
     */
    public static void showArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();  // Move to a new line after printing the array
    }

    /**
     * Performs the counting sort algorithm on the input array.
     * The method counts occurrences of each value, calculates cumulative counts,
     * and places elements into the sorted output array.
     *
     * @param in the input array to be sorted
     * @param maxValue  the maximum value in the input array
     * @return the sorted array
     */
    public static int[] countingSort(int[] in, int maxValue) {
        int[] count = new int[maxValue + 1];  // Initialize counting array
        int[] out = new int[in.length];  // Array to store sorted elements

        // Step 1: Count occurrences of each element in the input array
        for (int value : in) {
            count[value]++;
        }

        // Step 2: Compute cumulative sums
        for (int i = 1; i <= maxValue; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements into the sorted output array
        for (int i = in.length - 1; i >= 0; i--) {
            out[count[in[i]] - 1] = in[i];
            count[in[i]]--;
        }

        return out;  // Return the sorted array
    }

    /**
     * Main method for testing the counting sort algorithm.
     * It demonstrates sorting of small arrays, sorting of random arrays,
     * and comparing sorted int[] arrays with sorted ArrayLists.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Part 3: Testing counting sort on an unsorted array
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Unsorted array:");
        showArray(arr);  // Print unsorted array

        int max = 8;  // Maximum value in the array
        int[] sortedArray = countingSort(arr, max);
        System.out.println("Sorted array:");
        showArray(sortedArray);  // Print sorted array
        System.out.println("----------------------------------------");

        // Part 4: Generate and sort 1000 random integers in the range 0-499
        Random rand = new Random();
        int[] randomArray = new int[1000];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(500);  // Generate random numbers between 0 and 499
        }

        System.out.println("Random array before sorting:");
        showArray(randomArray);  // Print the random unsorted array

        int[] sortedRandomArray = countingSort(randomArray, 499);
        System.out.println("Random array after sorting:");
        showArray(sortedRandomArray);  // Print the random sorted array
        System.out.println("----------------------------------------");

        // Part 5: Compare int[] array with an ArrayList after sorting
        int[] array1 = randomArray.clone();  // Clone randomArray into array1
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : array1) {
            arrayList.add(value);  // Populate the ArrayList with the same values
        }

        sortedRandomArray = countingSort(array1, 499);  // Sort the array
        arrayList.sort(null);  // Sort the ArrayList using Collections.sort

        // Check if both the array and ArrayList contain the same elements after sorting
        boolean arraysEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (sortedRandomArray[i] != arrayList.get(i)) {
                arraysEqual = false;
                break;
            }
        }

        if (arraysEqual) {
            System.out.println("The arrays are the same.");
        } else {
            System.out.println("The arrays are different.");
        }
    }
}