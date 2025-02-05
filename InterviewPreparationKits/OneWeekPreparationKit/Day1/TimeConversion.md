# Time Conversion

## Content 📋
- [Description 📃](#description-)
- [Solution ✅](#solution-)
- [HackerRank link 🔗](#hackerrank-link-)

## Description 📃
Given a time in $12$[-hour AM/PM format](https://en.wikipedia.org/wiki/12-hour_clock), convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 

\- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

**Example**

- $s = 12:01:00PM$

    Return '12:01:00'.

- $s = 12:01:00AM$

    Return '00:01:00'.

**Function Description**

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

- string s: a time in $12$ hour format

**Returns**

- string: the time in $24$  hour format

**Input Format**

A single string  that represents a time in $12$-hour clock format (i.e.: **hh:mm:ss**$AM$ or **hh:mm:ss**$PM$).

**Constraints**

- All input times are valid

**Sample Input 0**

```bash
07:05:45PM
```

**Sample Output 0**

```bash
19:05:45
```

## Solution ✅
You can view the full implementation of the solution in [TimeConversion.java](TimeConversion.java) file.

## HackerRank link 🔗
Solve this problem on HackerRank: [TimeConversion Problem](https://www.hackerrank.com/challenges/time-conversion/problem)