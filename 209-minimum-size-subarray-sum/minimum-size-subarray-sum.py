class Solution(object):
    def minSubArrayLen(self, target, nums):
        i=j=0
        m=sys.maxint
        sum=0
        while j<len(nums):
            sum+=nums[j]
            while sum>=target and i<=j:
                m=min(m,j-i+1)
                sum-=nums[i]
                i+=1
           
            j+=1
        return 0 if m==sys.maxint else m        