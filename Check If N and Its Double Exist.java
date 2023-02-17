https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
class Solution {
    public boolean checkIfExist(int[] arr) {
        int i=0,f=0;
        for(i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && (arr[i]==2*arr[j])){
                    f=1;
                }
            }
        }
        if(f==1){
            return true;
        }
        else
            return false;
    }
}
