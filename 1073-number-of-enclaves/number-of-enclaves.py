class Solution(object):
    def numEnclaves(self, grid):
        m=len(grid)
        n=len(grid[0])
        c=0
        vis=[[0 for i in range(0,n)] for i in range(0,m)]
        for i in range(0,m):
            for j in range(0,n):
                if (i==0 or i==m-1) or (j==n-1 or j==0):
                    if grid[i][j]==1 and vis[i][j]==0:
                        self.f(i,j,grid,vis)
        for i in range(0,m):
            for j in range(0,n):
                if grid[i][j]==1 and vis[i][j]!=2:
                    c+=1
        return c
                
    def f(self,u,v,a,vis):
        if u>=0 and u<len(a) and v>=0 and v<len(a[0]) and a[u][v]==1 and vis[u][v] ==0:
            vis[u][v]=2
            self.f(u+1,v,a,vis)
            self.f(u,v+1,a,vis)
            self.f(u-1,v,a,vis)
            self.f(u,v-1,a,vis)
        



        
        