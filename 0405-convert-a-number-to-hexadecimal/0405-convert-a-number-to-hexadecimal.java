class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        StringBuilder ans = new StringBuilder();

        while (num != 0) {
            int digit = num & 15;
            char ch = hex.charAt(digit);
            ans.append(ch);
            num = num >>> 4;
        }

        return ans.reverse().toString();
    }
}