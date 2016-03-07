G = {'A':['B','C'],'B':['D','E'],'C':['D','E'],'D':['E'],'E':['A']}

"""
      A
    /   \
   B--D--C
    \ | /
      E
"""

def dfs_paths(graph,vertex,visited = None):
    if visited is None:
        visited = []
    visited.append(vertex)
    for next in graph[vertex]:
        if next not in visited:
            dfs_paths(graph,next,visited)
    return visited

def dfs(graph, start, visited = []):
    visited = visited + [start]
    for next in graph[start]:
        if next not in visited:
            dfs(graph,next,visited)
    return visited

def bfs(graph, vertex):
    visited= []
    curr = [vertex]
    while curr:
        vertex = curr.pop(0)
        if vertex not in visited:
            visited= visited+[vertex]
            curr =  curr + graph[vertex]
    return visited

def find_Bfs(graph, start, end):
    visited = []
    curr = [start]
    while curr:
        vertex = curr.pop(0)
        if vertex is end:
            return visited
        elif vertex not in visited:
            visited= visited+[vertex]
            curr = curr + graph[vertex]
    return None

def find_Dfs(graph, start, end, visited = None):
    if visited is None:
        visited = []
    visited.append(start)
    for next in graph[start]:
        if next is end:
            return visited
        elif next not in visited:
            find_Dfs(graph,next,end,visited)
    return visited



#print bfs(G,'A')
#print dfs_paths(G,'A')
print find_Bfs(G,'A','E')
print find_Dfs(G,'A','E')
