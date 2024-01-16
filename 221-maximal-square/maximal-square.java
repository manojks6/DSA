class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=-999;
        int DP[][]=new int[matrix.length][matrix[0].length];
        for(int x[]:DP){
            Arrays.fill(x,-1);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int x=f(i,j,matrix,DP);
                m=Math.max(m,x*x);
            }
        }
        return m;
    }
    static int f(int i,int j,char[][] a,int[][] DP){
        if(i>=a.length||i<0 || j<0 || j>=a[0].length || a[i][j]!='1'){
            return 0;
        }
        if(DP[i][j]!=-1){
            return DP[i][j];
        }
        int d,b,c;
        d=f(i+1,j,a,DP);
        b=f(i+1,j+1,a,DP);
        c=f(i,j+1,a,DP);
        return DP[i][j]=1+Math.min(Math.min(d,b),c);
    }
}