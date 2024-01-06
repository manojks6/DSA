class Solution {
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || i==m-1 || j==0 || j==n-1 )&& board[i][j]=='O'){
                    board[i][j]='T';
                    dfs(i,j,board);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }

            }
        }
    }
    static void dfs(int u,int v,char[][] a){
        a[u][v]='T';
        int row[]={0,0,-1,1};
        int col[]={1,-1,0,0};
        for(int i=0;i<4;i++){
            int c=col[i]+v,r=row[i]+u;
            if(r>=0 && c>=0 && r<a.length && c<a[0].length && a[r][c]=='O'){
                dfs(r,c,a);
            }
        }
    }
}