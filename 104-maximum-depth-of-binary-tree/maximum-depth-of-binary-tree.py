# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxDepth(self, root):
        return self.f(root)
    def f(self,root):
        if root==None:
            return 0
        l=self.f(root.right)
        r=self.f(root.left)
        return 1+max(l,r)