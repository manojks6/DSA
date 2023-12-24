class Solution(object):
    def maxConsecutive(self, bottom, top, special):
        special= sorted(special)
        m=max(special[0]-bottom,top-special[len(special)-1])
        for i in range(0,len(special)-1):
            m=max(m,special[i+1]-special[i]-1)
        return m if m!=1 else 0
        