## Container With Most Water

### Description

- You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.
- Find two lines that together with the x-axis form a container, such that the container contains the most water.
- Return *the maximum amount of water a container can store*.
- **Notice** that you may not slant the container.

### Attempt 1

My first approach for solving the _Container with Most Water_ problem was a brute-force solution that checks every possible combination of two heights. By using two nested loops, you calculate the amount of water each pair of lines can contain and update the maximum if the current pair holds more water. Although this method is correct, it checks all combinations of lines, resulting in an $O(n^2)$ time complexity, which may be inefficient for larger input sizes.

- 56/72 testcases passed
- Error: `TimeLimitExceeded`

```java
class Solution {
    public int maxArea(int[] height) {
        int maximumAmountOfWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (Math.min(height[i], height[j]) * (j - i) > maximumAmountOfWater) {
                    maximumAmountOfWater =  Math.min(height[i], height[j]) * (j - i);
                }
            }
        }

        return maximumAmountOfWater;
    }
}
```

### Two-Pointer Approach

You start with the widest possible container, formed by the lines at the two ends of the array (`leftmostIndex` and `rightmostIndex`). The area of water this container can hold is determined by the distance between the two pointers and the height of the shorter of the two lines. The key insight is that the water level is constrained by the shorter line, therefore:

- If you move the taller line inward, you are not likely to find a container with more water because the width is reduced, but the height constraint stays the same.
- By moving the shorter line inward, you give the possibility of finding a taller line that might increase the height of the water, and there is a chance for a greater area due to the increased height.

The two-pointer approach ensures that you only make one pass through the array. Each iteration, you either move the left or the right pointer inward by one step, meaning that both pointers move at most `n` times combined. Thus, the time complexity is $O(n)$.

### Attempt 2

- 62/62 testcases passed
- Runtime: 5 ms (beats 69.28%)
- Memory Usage: 57.6 MB (beats 69.83%)

```java
class Solution {
    public int maxArea(int[] height) {
        int leftmostIndex = 0;
        int rightmostIndex = height.length - 1;

        int areaOfWater = 0;

        while(leftmostIndex < rightmostIndex) {
            areaOfWater = Math.max(areaOfWater, Math.min(height[leftmostIndex], height[rightmostIndex]) * (rightmostIndex - leftmostIndex));

            if (height[leftmostIndex] < height[rightmostIndex]) {
                leftmostIndex++;
            } else {
                rightmostIndex--;
            }
        }

        return areaOfWater;
    }
}
```
