/*
https://www.youtube.com/watch?v=PfkBS9qIMRE&ab_channel=Jenny%27sLecturesCSIT
Bag in which carry some fixed weight

weights       = {3 ,4 ,6 ,5}
                || || || ||
value(profit) = {2 ,3 ,1 ,4}
=================================

Solution
Step 1 arrange the wights in ascending order

weights       = {3 ,4 ,5 ,6}
                || || || ||
value(profit) = {2 ,3 ,4 ,1}



xi = {1,0,0,1} , {0,0.0,1} ,......

total max wieght = 8
total max quantity = 4


 ````````w-> 0,1,2,3,4,5,6,7,8  (capacity of bag this x axis)
 pi wi   i 
         0   0,0,0,0,0,0,0,0,0 
 2  3    1   0,0,0,2,2,2,2,2,2    <==2 came here   2-2 = 0 so answer is wi 5,3  
 3  4    2   0,0,0,2,3,3,3,5,5
 4  5    3   0,0,0,2,3,4,4,5,6    <== first cell to have max value is the answer     6-4 = 2 (look for 2 now)
 1  6    4   0,0,0,2,3,4,4,5,6    <== look where 6 came first


  value of (weight in x , element in array at index) = max(current+ remaining weight previous iteration value , previous value )

  max[i,w] = max( m[i-1,w],m[i-1,w-w[i]]+p[i])


    solution 5,3 {3,4,6,5} => {1,0,0,1}




*/