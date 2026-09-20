# Algorithm guide

These cards follow two small Java exercises. They separate call-stack space
from output storage and do not treat an educational implementation as optimal.

## Recursive Fibonacci

Implementation: [`fib`](../FibonacciRecursion.java).

```text
# Fibonacci / Naive Binary Recursion
# Input: nonnegative index n
# Output: nth Fibonacci number in a Java int
# Time: O(2^n) upper bound; tighter growth is Theta(phi^n)
# Memory: O(n) maximum call-stack depth, not O(2^n) live memory

FUNCTION fib(n):
    IF n <= 1: RETURN n
    RETURN fib(n-1) + fib(n-2)
```

Repeated subproblems cause exponential work; the two recursive subtrees do not
all remain live simultaneously. The current method has no memoization.
Negative inputs return the negative input, and `int` overflows for sufficiently
large Fibonacci numbers. A future iterative rewrite could be O(n) time/O(1)
space, but that is not the current algorithm.

## Remove duplicate integers

Implementation: [`RemoveDuplicatesHash.main`](../RemoveDuplicatesHash.java).

```text
# Deduplication / Hash Set
# Input: N integers, U unique values
# Output: array containing each value once
# Time: expected O(N) to insert, then O(U) to copy
# Memory: O(U) set plus O(U) output array

set = empty hash set
FOR each input value: ADD value to set
ALLOCATE result[set size]
COPY each set entry into result
PRINT result
```

The source uses a fixed demonstration array; N describes the same loop with a
variable-length input. Set iteration does not preserve input order or promise
sorted order. Hash behavior and allocation overhead are not measured here.
