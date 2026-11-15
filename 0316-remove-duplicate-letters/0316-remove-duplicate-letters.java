
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        int[] last = new int[26];
        boolean[] seen = new boolean[26];

        // Step 1: Store last occurrence of each character
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Traverse the string
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            int idx = ch - 'a';

            // Skip if already present
            if (seen[idx]) {
                continue;
            }

            // Step 3: Remove larger characters if they appear again later
            while (!st.isEmpty() &&
                   st.peek() > ch &&
                   last[st.peek() - 'a'] > i) {

                char removed = st.pop();
                seen[removed - 'a'] = false;
            }

            // Step 4: Insert current character
            st.push(ch);
            seen[idx] = true;
        }

        // Step 5: Convert stack into string
        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
}
