class Solution {
    public int maxProduct(int[] arr) {
        int m=Integer.MIN_VALUE;
				for(int i=0;i<arr.length;i++){
					int sum=1;
					for(int j=i;j<arr.length;j++){
						sum*=arr[j];
						m=Math.max(m,sum);
					}
				}
				return m;        
    }
}