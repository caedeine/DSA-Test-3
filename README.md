# Notes

Using recurision, if a function goes on forever, eventually we will reach a StackOverflow error. 
Regardless of how much memory we put. It's imperative to have a condition where we leave the loop.
The mechanism to stop the loop is called the base case, which must be built in, usually an if-statement
- It is not very space efficient because we have to add space each time.  O(n)
- A for/while loop would have space complexity of O(1) for some *i*. (its time is O(n))
- We use recursion for some problems because its code is much easier to write, understand, and troubleshoot.


Recursion will add cost (use of memory) alongside any algorithm you decide to implement. 
ie. if the algorithm is O(1) space, it becomes O(n) because we've used recursion.

The StackFrame is the (main?)
The memory used to hold the stackframe is the stack. (where stackoverflow comes from)
a while(true) wont ever crash but a recursive loop eventually will. (?)

# 2




An error is something which cannot be be handled or caught, unlike an exception, which can be. 

# 3

everytime you call a method you ned some extra space. 


Dynamic programming example: 
for fibonacci numbers, say fib(7) is the sum of  fib(5) and fib(6). fib(5) is (fib 4 + 3) fib(6) is (4 + 3)
fib (3) is (2 + 1).... it makes a big tree. each node has two branches.  return case is going to be 0+ fib(2) (1), which is (0+1) which is 1, which is what fib(1) gets to.
for RECURSION:
as logn halves each time, this one doubles each time, so it is 2^n.
space complexity is n. you cant do the outermost ones without first evaluating the innermost level first, like fib(1)+ fib(2), 
then go upwards..


here, we have to for example find fib(3), but in another bracnh well have to evaluate it again, instead of doing it again,
we can just store it into an array, wehre 1 is fib(1)...... check first if its been calcualted in the array

With this adjustment the time complexity is now O(n)

space: O(n)

dynamic may be on the test. 

Tabulation/bottom up (space 1) (another solution) 
if i know  fib 1 is 0 and fib2 is 1, i just remember those two, get f(3). when i find fib(4) i just need fib(2) and fib(3). 
for fib 5 i need f3 and f4. this approach needs just 2 variables with previous 2. that bottommost memory spaec can then be removed.
space complexity is constant. 

time is n for dynamic, regardless of top down, bottom up, memoization, tabulation. 


top down (space n), and memoization. we have a record for every n value. 


