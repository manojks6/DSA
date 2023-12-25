class Solution(object):
    def numDecodings(self, s):
        dp=[0 for i in range(0,len(s)+1)]
        dp[len(s)]=1
        for i in range(len(s)-1,-1,-1):
            l=dp[i+1]
            r=0
            if i<len(s)-1 and( s[i]=='1' or s[i]=='2' and s[i+1]<'7'):
                r=dp[i+2]
            if s[i]=='0':
                dp[i]=0
            else:
                dp[i]=l+r
        return dp[0]
            
        