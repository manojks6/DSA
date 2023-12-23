class Solution(object):
    def twoSum(self, nums, target):
        d={}
        for i in range(0,len(nums)):
            d[nums[i]]=i
        for i in range(0,len(nums)):
            if target-nums[i] in d.keys() and i!=d[target-nums[i]]:
                return [i,d[target-nums[i]]]
        return[-1,-1]
        