import java.lang.*;
class Solution {
    public String longestPalindrome(String s) {
        int start= 0,end = 0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            int odd = palindrome(s,i,i);
            int even = palindrome(s,i,i+1);
            int len = Math.max(odd,even);

            if(len > end-start){
                start = i - (len-1)/2;
                end = i+len/2;
            }
           
         }
           return s.substring(start,end+1);
       }
       int palindrome(String s,int left,int right ){
           while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
               left--;
               right++;
           }
           return right-left-1;
       }
    
}
