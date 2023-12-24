class Solution(object):
    def sumOfThree(self, num):
        if num%3!=0:
            return []
        if num==0:
            return [-1,0,1]
        l=0
        h=num//3
        while l<h:
            m=(l+h)//2
            ans=m*3+3
            if ans==num:
                return [m,m+1,m+2]
            elif ans<num:
                l=m+1
            else:
                h=m-1
        return []


















        