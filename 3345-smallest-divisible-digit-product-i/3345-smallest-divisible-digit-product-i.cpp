class Solution {
public:
    int smallestNumber(int n, int t) {

        while (true) {
            int temp = n;
            int product = 1;

            while (temp > 0) {
                int digit = temp % 10;  // take last digit
                product *= digit;       // multiply it
                temp = temp / 10;       // remove last digit
            }

            if (product % t == 0) {
                return n;
            }

            n++; // check next number
        }
    }
};