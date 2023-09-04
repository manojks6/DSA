class Solution {
    static int l,h;
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        a[0]=lb(nums,nums.length,target);
        a[1]=ub(nums,nums.length,target);
        if(a[0]==nums.length || nums[a[0]]!=target){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        return a;
    }
    static int lb(int[] a,int n,int k){
        int l=0,h=n-1,ans=n;
        while(l<=h){
            int m=(h+l)/2;
            if(a[m]>=k){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    static int ub(int[] a,int n,int k){
        int l=0,h=n-1,ans=n;
        while(l<=h){
            int m=(h+l)/2;
            if(a[m]>k){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans-1;
    }
}