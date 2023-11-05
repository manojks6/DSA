class Solution {
    public int trap(int[] height) {
        int sum=0,n=height.length;
        for(int i=0;i<n;i++){
            int m1=0,m2=0;
            for(int j=0;j<=i;j++){
                m1=Math.max(m1,height[j]);
            }
            for(int j=n-1;j>=i;j--){
                m2=Math.max(m2,height[j]);
            }
            sum=sum+(Math.min(m2,m1)-height[i]);
        }
        return sum;
    }
}