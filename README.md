# Counting Sort Algorithm in Java

This project demonstrates the implementation of the **Counting Sort** algorithm in Java. It includes methods for displaying arrays, sorting arrays using the counting sort algorithm, and comparing sorted data between an array and an `ArrayList`.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies](#technologies)
- [How Counting Sort Works](#how-counting-sort-works)
- [Testing](#testing)
- [Example Output](#example-output)
- [Author](#author)

## Overview

Counting Sort is a non-comparative sorting algorithm used to sort integers. It works by counting occurrences of each element, calculating cumulative counts, and placing elements into the correct position in the output array. This implementation allows sorting arrays of integers with both fixed and random data.

## Features

- **Display array data**: Method to display array contents.
- **Counting Sort implementation**: Efficient algorithm to sort integer arrays.
- **Random array generation**: Create random arrays of integers for sorting.
- **Comparison of sorted arrays**: Compare the results of sorting an `int[]` array and an `ArrayList<Integer>`.
- **Performance testing**: Sorting large arrays with 1000 random integers.

## Technologies

- **Java**: Core language for the implementation.
- **Random class**: To generate random numbers.
- **ArrayList**: Used for comparison with sorted arrays.
- **Javadoc**: For method and class documentation.
- 
### Prerequisites

- Java JDK (version 8 or above)
- IDE (such as IntelliJ IDEA, Eclipse, or any Java-supported editor)

### Steps to run the project:

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/nav7FSC/counting-sort-java.git
2. Open the project in your preferred Java IDE.
3. Navigate to the `Main` class.
4. Compile and run the `Main` class to execute the counting sort and display the results.
5. You should see outputs showing the unsorted array, the sorted array, and a comparison between sorted arrays using `int[]` and `ArrayList<Integer>`.

## How Counting Sort Works

Counting Sort works in the following steps:

1. **Counting Occurrences**: It counts the number of occurrences of each element in the input array.
2. **Cumulative Count**: It computes the cumulative count to determine the position of each element in the sorted array.
3. **Placement**: It places the elements into the correct position in the sorted array based on the cumulative count.
4. **Output**: The final output is the sorted array.

- Time Complexity: O(n + k) where n is the number of elements in the input array and k is the range of input values.
- Space Complexity: O(n + k)

## Testing

To verify the functionality of the Counting Sort implementation, the following tests are conducted:

1. **Initial Array Output**: Displays the unsorted array generated with random integers.
2. **Sorted Array Output**: Shows the result of the counting sort on the initial array.
3. **Comparison of Arrays**: Compares the sorted `int[]` array with the sorted `ArrayList<Integer>` to ensure they contain the same elements. The output indicates whether the two collections match.


## Example Output

When running the program, you can expect an output similar to the following:

    Unsorted Array: [329, 457, 657, 839, 2, 0, 999, 123, 42, 37, 500, 499]
    Sorted Array: [0, 2, 37, 42, 123, 329, 457, 499, 500, 657, 839, 999]

    Comparing sorted arrays:
    Array of integers: [0, 2, 37, 42, 123, 329, 457, 499, 500, 657, 839, 999]
    ArrayList<Integer>: [0, 2, 37, 42, 123, 329, 457, 499, 500, 657, 839, 999]

    The arrays are the same.

## Author

- Nav Singh: [nav7FSC](https://github.com/nav7FSC)