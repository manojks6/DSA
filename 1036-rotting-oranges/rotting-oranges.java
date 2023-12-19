class Solution {
    public class Pair{
        int r,c,t;
        Pair(int r,int c,int t){
            this.r=r;
            this.c=c;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<Pair>();
        int n=grid[0].length,m=grid.length,fresh=0,vis[][]=new int[m][n],ans=0,rout=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int row[]={-1,1,0,0};
        int col[]={0,0,1,-1};
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int t=q.peek().t;
            ans=Math.max(t,ans);
            q.poll();
            for(int i=0;i<4;i++){
                    if(r+row[i]>=0 && r+row[i]<m && c+col[i]>=0 && c+col[i]<n && grid[r+row[i]][c+col[i]]==1 && vis[r+row[i]][c+col[i]]==0){
                        q.add(new Pair(r+row[i],c+col[i],t+1));
                        vis[r+row[i]][c+col[i]]=2;
                        rout++;
                    }
            }
        }
        return fresh!=rout?-1:ans;
    }
}
