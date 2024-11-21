package array;

// https://www.geeksforgeeks.org/minimum-replacements-required-to-make-sum-of-all-k-length-subarrays-equal/

// Java program for the above approach
import java.lang.*;
import java.util.*;

public class SubarrayEqualSum {

    // Function to find minimum number of
    // operations required to make sum of
    // all subarrays of size K equal
    public static int findMinOperations(int arr[],  int N, int K)
    {

        // Stores number of operations
        int operations = 0;

        // Iterate in the range [0, K-1]
        for (int i = 0; i < K; i++) {

            // Stores frequency of elements
            // separated by distance K
            Map<Integer, Integer> freq=new HashMap<>();

            for (int j = i; j < N; j += K)
                freq.put(arr[j], freq.getOrDefault(arr[j],0)+1);

            // Stores maximum frequency
            // and corresponding element
            int max1 = 0, num=-1;

            // Find max frequency element
            // and its frequency
            for (Map.Entry<Integer,Integer> x : freq.entrySet()) {
                if (x.getValue() > max1) {
                    max1 = x.getValue();
                    num = x.getKey();
                }
            }

            // Update the number of operations
            for ( Map.Entry<Integer,Integer> x : freq.entrySet()) {
                if (x.getKey() != num)
                    operations += x.getValue();
            }
        }

        // Print the result
        return operations;
    }
}