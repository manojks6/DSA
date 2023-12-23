class Solution(object):
    def longestCommonSubsequence(self, s1, s2):
        l=[[-1 for i in range(0,len(s2)+1)] for j in range(0,len(s1)+1)]
        return self.f(len(s1)-1,len(s2)-1,s1,s2,l)
    def f(self, i,j,s1,s2,l):
        if i<0 or j<0:
            return 0
        if l[i+1][j+1]!=-1:
            return l[i+1][j+1]
        if s1[i]==s2[j]:
            l[i+1][j+1]=1+self.f(i-1,j-1,s1,s2,l)
            return l[i+1][j+1]
        l[i+1][j+1]=max(self.f(i-1,j,s1,s2,l),self.f(i,j-1,s1,s2,l))
        return l[i+1][j+1]
    