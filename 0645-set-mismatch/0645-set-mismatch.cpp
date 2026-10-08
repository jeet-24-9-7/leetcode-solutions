class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();

        unordered_set<int> st;
        int dup = -1;

        for (int val : nums) {
            if (st.contains(val)) {
                dup = val;
            }

            st.insert(val);
        }

        int miss = -1;

        for (int i = 1; i <= n; i++) {
            if (!st.contains(i)) {
                miss = i;
                break;
            }
        }

        return {dup, miss};
    }
};