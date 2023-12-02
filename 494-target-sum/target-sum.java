class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int s=(sum+target)/2;
        if(sum<target || (target+sum)%2!=0){
            return 0;
        }
        return f(nums.length-1,s,nums);
    }

    static int f(int i,int sum,int[] a){
        if(i==0){
            if(a[i]==0 && sum==0){
                return 2;
            }
            if(a[0]==sum ||sum==0){
                return 1;
            }
            return 0;
        }
        
        int l=0;
        if(sum>=a[i])
            l=f(i-1,sum-a[i],a);
        int r=f(i-1,sum,a);
        return l+r;
    }
}