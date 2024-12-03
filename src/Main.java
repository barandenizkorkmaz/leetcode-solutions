import java.util.List;

import static array.SubarrayEqualSum.findMinOperations;
import trie.FindCompoundWords;

public class Main {
    public static void main(String[] args) {
        // Driver code

        // Given Input
        int[] arr = { 1,2,3,1,2};
        int K = 3;
        int N = arr.length;

        // Function Call
        int result = findMinOperations(arr, N, K);

        System.out.println("Result is: " + result);

        int[][] arr2 = {
                {1,2,3},
                {4,5,6}
        };
        int[] row = arr2[0];
        for(int num : row){
            System.out.println(num);
        }

        // Find Compound Words
        String[] words = {"rock", "star", "rockstar"};
        List<String> compoundWords = FindCompoundWords.findCompoundWords(words);
        System.out.printf("Found %d compound word(s).\n", compoundWords.size());
        for(String compoundWord : compoundWords){
            System.out.println(compoundWord);
        }
        System.out.println("End of compound words.");
        System.out.println("Hello world!");
    }
}