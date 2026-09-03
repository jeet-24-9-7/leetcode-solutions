class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        // Find the smallest odd number
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }

        // Check if an even number is smaller than minOdd
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0 && minOdd != Integer.MAX_VALUE
                    && nums1[i] < minOdd) {
                return false;
            }
        }

        return true;
    }
}