class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length,n=grid[0].length,c=0;
        int vis[][]=new int[m][n];
        for(int i[] :vis){
            Arrays.fill(i,0);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    if(i==0 || i==m-1){
                        f(i,j,grid,vis);
                    }
                    else if(j==0 || j==n-1){
                        f(i,j,grid,vis);
                    }
                }
                
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]!=2){
                    c++;
                }
            }
        }
        return c;
    }
    static void f(int u,int v,int a[][],int vis[][]){
        vis[u][v]=2;
        int col[]={0,1,-1,0};
        int row[]={-1,0,0,1};
        for(int i=0;i<4;i++){
            int r=u+row[i],c=v+col[i];
            if(r>=0 && r<a.length && c>=0 && c<a[0].length && vis[r][c]==0 && a[r][c]==1){
                vis[r][c]=2;
                f(r,c,a,vis);
            }
        }
    }
}