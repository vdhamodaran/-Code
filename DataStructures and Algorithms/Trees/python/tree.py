class treeNode(object):
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

    def isEmpty(self):
        return false

    def printTree(self):
        print self.data
        if self.left:
            self.left.printTree()
        if self.right:
            self.right.printTree()

    def invertTree(self, root):
        if root:
            root.left, root.right = root.right, root.left
            self.invertTree(root.left)
            self.invertTree(root.right)
        return root

    def isBalanced(self, root):
        return self.checkBalance(root)>=0

    def checkBalance(self,root):
        if root == None:
            return 0
        # print root.data
        left = self.checkBalance(root.left)
        right = self.checkBalance(root.right)
        # print "L: ",left, "R: ",right, "M: ",(max(left,right)+1)
        if left<0 or right<0 or abs(left-right)>1:
            return -1;
        return max(left,right) + 1

    def depth(self, root):
        if root is None:
            return 0
        #max(self.depth(root.left),self.depth(root.right))+1
        return max(self.depth(root.left),self.depth(root.right))+1

def insert(root,data):
    if root.data:
        if data < root.data:
            if root.left is None:
                root.left = treeNode(data)
            else:
                insert(root.left,data)
        elif data > root.data:
            if root.right is None:
                root.right = treeNode(data)
            else:
                insert(root.right,data)
    else:
        root.data = data

# def delete(root,data):
#     if root:
#         if root.data == data:
#             remove(root)
#             print "found: "+root.data
#         elif data < root.data:
#             print "left"
#             delete(root.left, data)
#         else:
#             print "right"
#             delete(root.right, data)
#     else:
#         print "not found"
# def remove(node):
#     if node.left and node.right:
#         print "has both left and right children"
#     elif node.left:
#         print "has only left"
#     elif node.right:
#         print "has only right"
#     else:
#         print "has no children"
def tree_to_Dict(node,dict={}):
    array=[]
    if node:
        if node.left:
            array.append(node.left.data)
        if node.right:
            array.append(node.right.data)
        if array!=[]:
            dict[node.data]=array
        tree_to_Dict(node.left)
        tree_to_Dict(node.right)
    return dict

def print_Depth(node):
    depth = 0
    curr =[]
    out=[]
    if node:
        curr.append(node)
        while curr:
            next =[]
            for n in curr:
                out.append(n.data)
                if n.left:
                    next.append(n.left)
                if n.right:
                    next.append(n.right)
            curr=next
            print depth," - ",out
            out=[]
            depth+=1

def bfs(node):
    curr = []
    out = []
    if node:
        curr.append(node)
        while curr:
            next = []
            for n in curr:
                out.append(n.data)
                if n.left:
                    next.append(n.left)
                if n.right:
                    next.append(n.right)
            curr=next
        print out

def dfs(node):
    curr = []
    out = []
    if node:
        curr.append(node)
        while curr:
            x = curr.pop(0)
            out.append(x.data)
            if x.right:
                curr.append(x.right)
            if x.left:
                curr.append(x.left)
        print out

def inorder(node):
    if node:
        inorder(node.left)
        print node.data
        inorder(node.right)

def preorder(node):
    if node:
        print node.data
        preorder(node.left)
        preorder(node.right)

def postorder(node):
    if node:
        postorder(node.left)
        postorder(node.right)
        print node.data

def search(node,data):
    if node is None or node.data == data:
        return node
    elif data < node.data:
        return search(node.left, data)
    else:  # key > node.key
        return search(node.right, data)
def invertTree(root):
    """
    :type root: TreeNode
    :rtype: TreeNode
    """
    temp = root
    if root:
        temp = invert(root)
    return temp

def invert(root):
    temp = root.left
    root.left = root.right
    root.right = temp
    if root.left:
        return invert(root.left)
    if root.right:
        return invert(root.right)

tree = treeNode('4')
insert(tree,'2')
insert(tree,'3')
insert(tree,'1')
insert(tree,'6')
insert(tree,'5')
insert(tree,'7')
# insert(tree,'8')
# insert(tree,'9')
# tree.left=treeNode('2')
# tree.right=treeNode('6')
# tree.left.left=treeNode('1')
# tree.left.right=treeNode('3')
# tree.right.left=treeNode('5')
# tree.right.right=treeNode('7')
# delete(tree,'6')
# print
# delete(tree,'7')
# dfs(tree)
# bfs(tree)
print "original"
print_Depth(tree)
print tree.depth(tree)

# print tree_to_Dict(tree)
# preorder(tree)
# postorder(tree)
# inorder(tree)
# tree.printTree()
# print search(tree,'2')
# print search(tree,'7')
# print "tree:", tree.data, tree.left, tree.right
