# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        res = []
        def dfs(node):
            if not node:
                res.append("N")
                return

            res.append(str(node.val)) 
            left = dfs(node.left)
            right = dfs(node.right)
        
        dfs(root)
        return ",".join(res)



    def deserialize(self, data):
        vals = data.split(",")
        self.i = 0
        def helper():
            if vals[self.i] == "N":
                self.i += 1
                return None
            newNode =  TreeNode(int (vals[self.i]))
            self.i += 1
            newNode.left = helper()
            newNode.right = helper()
            return newNode

        return helper()

        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))