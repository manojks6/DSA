class Solution {
    public boolean searchMatrix(int[][] matrix, int x) {
        int m=matrix.length,n=matrix[0].length,r=0,c=n-1; 
	    while(r<m && c>=0){
	        if(matrix[r][c]==x){
	            return true;
	        }
	        if(matrix[r][c]<x){
	            r++;
	        }
	        else{
	            c--;
	        }
	    }
	    return false;       
    }
}