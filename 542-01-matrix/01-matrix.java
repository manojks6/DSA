class Solution {
    class Pair{
        int r,c,step;
        Pair(int r,int c,int step){
            this.r=r;
            this.c=c;
            this.step=step;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q=new LinkedList<Pair>();
        int m=mat.length,n=mat[0].length;
        int vis[][]=new int[m][n];
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            Pair p=q.peek();
            q.poll();
            int r=p.r,c=p.c,step=p.step;
            ans[r][c]=step;
            int row[]={0,0,1,-1};
            int col[]={1,-1,0,0};
            for(int i=0;i<4;i++){
                int cc=c+col[i],rr=r+row[i];
                if(cc>=0 && rr>=0 && rr<m && cc<n && vis[rr][cc]!=1){
                    vis[rr][cc]=1;
                    q.add(new Pair(rr,cc,step+1));
                }
            }
        }
        return ans;
    }
}