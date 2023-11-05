class Solution {
    public int maxArea(int[] height) {
        int m1=0,m2=0,n=height.length;
        int m=0,i=0,j=n-1;
        while(i<j){
            m=Math.max(m,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        return m;
    }
}