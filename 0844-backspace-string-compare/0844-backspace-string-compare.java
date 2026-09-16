class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }

            } else {
                sb.append(c);
            }
        }
        for (int j = 0; j < m; j++) {
            char c = t.charAt(j);
            if (c == '#') {
                if (sb1.length() > 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }

            } else {
                sb1.append(c);
            }
        }
        if(sb.toString().equals(sb1.toString())) {
            return true;
        }
        return false;

    }
}