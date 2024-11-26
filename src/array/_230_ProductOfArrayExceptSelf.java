package array;

public class _230_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        prefix[0] = 1;
        postfix[n - 1] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
            postfix[n - i - 1] = postfix[n - i] * nums[n - i];

        }
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = prefix[i] * postfix[i];
        }
        return result;
    }
}
