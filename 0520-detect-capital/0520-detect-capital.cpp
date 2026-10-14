class Solution {
public:
    bool detectCapitalUse(string word) {
       int cnt=0;
       for(char ch:word){
            int val=ch;
            if(ch>=65&&ch<=90){
                cnt++;
            }
       }
       int  n=word.length();
       if(n==cnt||cnt==0) return true;
       else if(cnt==1&& isupper(word[0])) return true;
       return false;
    }
};