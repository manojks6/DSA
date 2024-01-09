# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def leafSimilar(self, root1, root2):
        l1=[]
        l2=[]
        self.f(root1,l1)
        self.f(root2,l2)
        return l1==l2
    def f(self,r,l):
        if r==None:
            return
        if r.left==None and r.right==None:
            l.append(r.val)
        self.f(r.right,l)
        self.f(r.left,l)
        