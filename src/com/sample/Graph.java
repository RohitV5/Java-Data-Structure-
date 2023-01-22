// Graph can be described using adjacency matrix and adjaceny list  (if there is a direct vertex then mark that distance. if not then mark 0)

// adjacency matrix  n x n   a[i][j] is adjecent then 1 otherwise 0   space complexity O(n^2)

/*
[1....n-1 n]
[2......   ]
.
.
.
[n......n-1 n]
*/





// Adjacency list



//adjacency list. each node willl be maintaining a link list which will point to its adjecent link.  Space complexity O(n+2e)

// 2e means 2 edge  so for each edge we are storing 2 time .


//For dense graph its better to use adjacency matrix

//For sparse graph its better to use adjacency list.



//Source: https://www.youtube.com/watch?v=5hPfm_uqXmw&ab_channel=Jenny%27sLecturesCSIT