class Solution {
    public int findKOr(int[] nums, int k) {
        int ans[]=new int[32];
        int sum=0;
        for(int n:nums){
            int x=1;
            for(int i=0;i<32;i++){
                if(n%2==1){
                    ans[i]+=1;
                }
                n=n/2;
            }
        }
        for(int i=0;i<32;i++){
            if(ans[i]>=k){
                sum+=Math.pow(2,i);
            }
        }
        return sum;
    }
}