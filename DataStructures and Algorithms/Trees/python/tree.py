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

def search(node, item):
    if node:
        if node.data == item:
            return node
        elif node.data<item:
            return search(node.right, item)
        elif node.data>item:
            return search(node.left, item)
    else:
        return None

tree = treeNode('15')
tree.left=treeNode('9')
tree.right=treeNode('26')
tree.left.left=treeNode('8')
tree.right.left=treeNode('21')
tree.right.right=treeNode('32')
dfs(tree)
# bfs(tree)
# print_Depth(tree)
# print tree_to_Dict(tree)
# preorder(tree)
# postorder(tree)
# inorder(tree)
# tree.printTree()
# print search(tree,'32')
# print "tree:", tree.data, tree.left, tree.right
