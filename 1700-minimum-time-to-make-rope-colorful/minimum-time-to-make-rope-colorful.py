class Solution(object):
    def minCost(self, colors, neededTime):
        m=0
        j=0
        while j<len(colors)-1 :
            if colors[j]==colors[j+1]:
                m+=min(neededTime[j],neededTime[j+1])
                neededTime[j+1]=max(neededTime[j],neededTime[j+1])
            j+=1
        return m

        