class Solution(object):
    def longestConsecutive(self, nums):
        s=set(nums)
        m=0
        for i in nums:
            c=1
            t=i
            while i-1 not in s and t+1 in s:
                c+=1
                t+=1
            m=max(c,m)
        return m
        