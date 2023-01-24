// Used to find out minimum spanning tree.

/*

SOURCE: https://www.programiz.com/dsa/prim-algorithm
Best explanantion: https://www.youtube.com/watch?v=ZtZaR7EcI5Y&t=239s&ab_channel=Jenny%27sLecturesCSIT

Prim's Algorithm
In this tutorial, you will learn how Prim's Algorithm works. 
Also, you will find working examples of Prim's Algorithm in C, C++, Java and Python.

Prim's algorithm is a minimum spanning tree algorithm that takes a graph as input and finds the subset of the edges of that graph which
In other words find minimum cost to cover all nodes.
Differenct from Dijkstra which is used to find SSSP - single source shortest path graph

form a tree that includes every vertex
has the minimum sum of weights among all the trees that can be formed from the graph
How Prim's algorithm works
It falls under a class of algorithms called greedy algorithms that find the local optimum in the hopes of finding a global optimum.

We start from one vertex and keep adding edges with the lowest weight until we reach our goal.

The steps for implementing Prim's algorithm are as follows:

Initialize the minimum spanning tree with a vertex chosen at random.
Find all the edges that connect the tree to new vertices, find the minimum and add it to the tree
Keep repeating step 2 until we get a minimum spanning tree


Prim's Algorithm PSEUDOCODE
The pseudocode for prim's algorithm shows how we create two sets of vertices U and V-U. U contains the 
list of vertices that have been visited and V-U the list of vertices that haven't. One by one, we move vertices 
from set V-U to set U by connecting the least weight edge.

T = ∅;
U = { 1 };
while (U ≠ V)
    let (u, v) be the lowest cost edge such that u ∈ U and v ∈ V - U;
    T = T ∪ {(u, v)}
    U = U ∪ {v}


*/