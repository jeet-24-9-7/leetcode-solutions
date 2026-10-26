class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n = nums.size();
        int total = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < n; i++) {

            rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
};