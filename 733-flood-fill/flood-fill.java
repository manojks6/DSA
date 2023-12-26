class Solution {
    class Pair{
        int r,c;
        Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(sr,sc));
        int m=image.length,n=image[0].length;
        int vis[][]=new int[m][n];
        for(int x[]:vis){
            Arrays.fill(x,0);
        }
        if(image[sr][sc]==color){
            return image;
        }
        int ans[][]=image;
        int oldColor=image[sr][sc];
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            q.poll();
            ans[r][c]=color;
            int col[]={0,0,-1,1},row[]={1,-1,0,0};
            for(int i=0;i<4;i++){
                int rr=r+row[i],cc=c+col[i];
                if(rr>=0 && rr<m && cc>=0 && cc<n && image[rr][cc]==oldColor){
                    q.add(new Pair(rr,cc));
                }
            }
            
        }
        return ans;   
    }

}