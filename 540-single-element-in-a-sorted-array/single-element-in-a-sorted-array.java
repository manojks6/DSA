class Solution {
    public int singleNonDuplicate(int[] a) {
        int l=0,h=a.length-1;
        while(l<=h){
            if(l<a.length-1&&a[l]==a[l+1]){
                l+=2;
            }
            else{
                return a[l];
            }
            if(h>0&&a[h]==a[h-1]){
                h-=2;
            }
            else{
                return a[h];
            }
        }
        return -1;
    }
}