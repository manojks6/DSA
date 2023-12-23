class Solution(object):
    def trap(self, height):
        l=height[:]
        r=height[:]
        ml=-99999 
        sum=0
        mr=-99999
        for i in range(0,len(height)):
            ml=max(ml,height[i])
            l[i]=ml

        for i in range(len(height)-1,-1,-1):
            mr=max(mr,height[i])
            r[i]=mr
        for i in range(0,len(height)):
            sum=sum+(min(r[i],l[i])-height[i])
        return sum
                