class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length,c=0;
        int vis[][]=new int[m][n];
        for(int i[]:vis){
            Arrays.fill(i,0);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    c++;
                    f(i,j,grid,vis);
                }
            }
        }
        return c;
    }
    static void f(int u,int v,char a[][],int vis[][]){
        vis[u][v]=1;
        int col[]={-1,0,1,0},row[]={0,1,0,-1};
        for(int i=0;i<4;i++){
            int r=u+row[i],c=v+col[i];
            if(r>=0 && r<a.length && c>=0 && c<a[0].length && vis[r][c]==0 && a[r][c]=='1'){
                vis[r][c]=1;
                f(r,c,a,vis);
            }
        }
    }
}