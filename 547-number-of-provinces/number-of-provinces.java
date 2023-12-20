class Solution {
    public int findCircleNum(int[][] adj) {
        int n=0,V=adj.length;
        int vis[]=new int[V];
        Arrays.fill(vis,0);
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                n++;
                f(i,vis,adj);
                 
            }
        }
        return n;
    }
    static void f(int n,int[] vis,int[][] adj){
        vis[n]=1;
        for(int i=0;i<adj[n].length;i++){
            if(vis[i]==0 && adj[n][i]==1){
                vis[i]=1;
                f(i,vis,adj);
            }
        }
    }
}