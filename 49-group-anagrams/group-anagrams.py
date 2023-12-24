class Solution(object):
    def groupAnagrams(self, strs):
        d={}
        l=[[]]
        for i in strs:
            s=str(sorted(i))
            if s in d.keys():
                d[s].append(i)
            else:
                x=list()
                x.append(i)
                d[s]=x
        return d.values()