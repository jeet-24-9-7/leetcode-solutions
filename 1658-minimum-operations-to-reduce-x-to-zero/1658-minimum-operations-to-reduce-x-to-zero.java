class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;

        // Find total sum
        for (int num : nums) {
            total += num;
        }

        // We need to keep a subarray with this sum
        // for the first case --> 11 - 5 = 6
        int target = total - x;

        if (target < 0) {
            return -1;
        }

        int start = 0;
        int currSum = 0;
        int maxLen = -1;

        // Sliding window
        for (int end = 0; end < n; end++) {

            currSum += nums[end];

            // Shrink window if sum becomes too large
            while (currSum > target) {
                currSum -= nums[start];
                start++;
            }

            // Found a valid subarray
            if (currSum == target) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }

        // No valid subarray found
        if (maxLen == -1) {
            return -1;
        }

        // Remove everything outside the longest valid subarray
        return n - maxLen;
    }
}