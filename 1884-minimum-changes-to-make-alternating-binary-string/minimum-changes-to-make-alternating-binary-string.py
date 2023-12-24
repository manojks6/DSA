class Solution(object):
    def minOperations(self, s):
        c=c1=0
        for i in range(0,len(s)):
            if i%2==0 and s[i]=='1':
                c+=1
            if i%2!=0 and s[i]=='0':
                c+=1

            if i%2!=0 and s[i]=='1':
                c1+=1
            if i%2==0 and s[i]=='0':
                c1+=1

        return min(c1,c)