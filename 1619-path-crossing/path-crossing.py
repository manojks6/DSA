class Solution(object):
    def isPathCrossing(self, path):
        l=[]
        pre=[0,0]
        l.append(pre)
        for i in path:
            if i=='N':
                x=[pre[0]-1,pre[1]]
            elif i=='S':
                x=[pre[0]+1,pre[1]]
            elif i=='E':
                x=[pre[0],pre[1]+1]
            else:
                x=[pre[0],pre[1]-1]
            if x in l:
                return True
            pre=x
            l.append(x)
        return False


        