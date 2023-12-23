class Solution(object):
    def lengthOfLongestSubstring(self, s):
        st=set()
        i=j=m=0
        while j<len(s):
            while s[j] in st and i<=j:
                st.remove(s[i])
                i+=1
            st.add(s[j])
            j+=1
            m=max(m,len(st))
        return m

        