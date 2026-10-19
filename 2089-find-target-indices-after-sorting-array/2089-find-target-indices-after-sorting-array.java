class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int firstOccur = -1;

        int start = 0;
        int end = n - 1;

        // Find first occurrence of target
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                firstOccur = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Target not found
        if (firstOccur == -1) {
            return ans;
        }

        // Add all target indices
        for (int i = firstOccur; i < n && nums[i] == target; i++) {
            ans.add(i);
        }

        return ans;
    }
}