import java.util.Arrays;

class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] arr = new int[n + 1];  
        Arrays.fill(arr, -1);        
        arr[0] = 0;
        arr[1] = 1;

        return helper(arr, n);
    }

    private int helper(int[] arr, int n) {
        if (arr[n] != -1) {  
            return arr[n];
        }

        arr[n] = helper(arr, n - 1) + helper(arr, n - 2);
        return arr[n];
    }
}
