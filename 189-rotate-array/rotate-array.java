class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        r(0,nums.length-1,nums);
        r(0,k-1,nums);
        r(k,nums.length-1,nums);
    }
    static void r(int i,int j,int[] a){
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            j--;
            i++;
        }
    }
}