# Plus Minus

## Content 📋
- [Description 📃](#description-)
- [Solution ✅](#solution-)
- [HackerRank link 🔗](#hackerrank-link-)

## Description 📃
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

**Note:** This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to $10^{-4}$ are acceptable.

**Example**

There are $n = 5$ elements, two positive, two negative and one zero. Their ratios are $\frac{2}{5} = 0.400000$, $\frac{2}{5} = 0.400000$ and $\frac{1}{5} = 0.200000$. Results are printed as:

```bash
0.400000
0.400000
0.200000
```

**Function Description**

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

- int arr[n]: an array of integers

**Print**
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

**Input Format**

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe $arr[n]$.

**Constraints**

$0 < n \leq 100$

$-100 \leq arr[i] \leq 100$

**Output Format**

**Print** the following $3$ lines, each to $6$ decimals:

1. proportion of positive values
2. proportion of negative values
3. proportion of zeros

**Sample Input**

```bash
STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
```

**Sample Output**

```bash
0.500000
0.333333
0.166667
```

**Explanation**

There are $3$ positive numbers, $2$ negative numbers, and $1$ zero in the array.

The proportions of occurrence are positive: $\frac{3}{6} = 0.500000$, negative: $\frac{2}{6} = 0.333333$ and zeros: $\frac{1}{6} = 0.166667$.

## Solution ✅
You can view the full implementation of the solution in [PlusMinus.java](PlusMinus.java) file.

## HackerRank link 🔗
Solve this problem on HackerRank: [PlusMinus Problem](https://www.hackerrank.com/challenges/plus-minus/problem)