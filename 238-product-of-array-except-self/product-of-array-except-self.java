class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
        int ans[]=new int[n];
        int sum=1;
        if(n==1){
            ans[0]=1;
            return ans;
	    }
        for(int i=0;i<n;i++){
            sum=nums[i]*sum;
            a[i]=sum;
        }
        sum=1;
        for(int i=n-1;i>=0;i--){
            sum=sum*nums[i];
            b[i]=sum;
        }
        for(int i=1;i<n-1;i++){
            ans[i]=a[i-1]*b[i+1];
        }
        ans[0]=b[1];
        ans[n-1]=a[n-2];
        return ans;
    }
}