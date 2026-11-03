class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
        int n = nums.size();

        vector<int> even;
        vector<int> odd;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.push_back(nums[i]);
            } else {
                odd.push_back(nums[i]);
            }
        }

        sort(even.begin(), even.end());
        sort(odd.begin(), odd.end(), greater<int>());

        vector<int> result(n);

        int e = 0, o = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = even[e];
                e++;
            } else {
                result[i] = odd[o];
                o++;
            }
        }

        return result;
    }
};