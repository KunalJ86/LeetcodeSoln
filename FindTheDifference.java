https://leetcode.com/problems/find-the-difference/description/
class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        char temp=' ';int i=0;
        for(i=0;i<a.length;i++){
            if(a[i]!=b[i]){
             temp=b[i];
             break;}
        }
        if(i==a.length){
            temp=b[i];
        }
        return temp;
    }
}
