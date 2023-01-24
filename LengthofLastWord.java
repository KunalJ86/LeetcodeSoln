https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        int i;
        for(i=s.length()-1;i>0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                break;
            }
        }
        int last= s.substring(0,i).lastIndexOf(" ");
        int l=i-last;
        return l;
    }
}
