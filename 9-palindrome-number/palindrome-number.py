class Solution(object):
    def isPalindrome(self, x):
        res=0
        n=x
        if x<0:
            return False
        while x>0:
            res=res*10+x%10
            x=x//10
        return n==res
        