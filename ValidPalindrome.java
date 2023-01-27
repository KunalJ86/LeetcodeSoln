https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String f="",b="";
     for(int i=0;i<=s.length()-1;i++){
        boolean b1=Character.isAlphabetic(s.charAt(i));
        boolean b2=Character.isDigit(s.charAt(i));
        if(b1||b2){
            f=f+s.charAt(i);
            b=s.charAt(i)+b;
        }
     }
     return b.equals(f);   
    }
}
