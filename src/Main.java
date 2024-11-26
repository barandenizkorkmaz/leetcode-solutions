import static array.SubarrayEqualSum.findMinOperations;

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

        System.out.println("Hello world!");
    }
}