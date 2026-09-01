class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        long first_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] == first_max || nums[i] == second_max || nums[i] == third_max) {
                continue;
            }
            if (nums[i] > first_max) {
                third_max = second_max;
                second_max = first_max;
                first_max = nums[i];
            } else if (nums[i] > second_max && nums[i] < first_max) {
                third_max = second_max;
                second_max = nums[i];
            } else if (nums[i] > third_max && nums[i] < second_max) {
                third_max = nums[i];
            }

        }
        if (third_max == Long.MIN_VALUE) {
            return (int)first_max;
        }
        return (int)third_max;
    }
}