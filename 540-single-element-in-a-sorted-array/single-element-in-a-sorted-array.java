class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length,l=0,h=n-1;
        while(l<=h){
            if(l<n-1 && a[l]==a[l+1]){
                l+=2;
            }
            else{
                return a[l];
            }
            if(h>0 && a[h]==a[h-1]){
                h-=2;
            }
            else{
                return a[h];
            }
        }
        return -1;
    }
}