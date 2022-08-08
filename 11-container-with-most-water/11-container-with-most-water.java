class Solution {
    public int maxArea(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length-1;
        int max = 0;
        if (height.length == 2) {
            return Math.min(height[ptr1], height[ptr2]);
        }
        while (ptr2 >= ptr1) {
            if (Math.min(height[ptr1], height[ptr2]) * (ptr2-ptr1) > max) {
                max = Math.min(height[ptr1], height[ptr2]) * (ptr2-ptr1);
            }
            if (height[ptr1] <= height[ptr2]) {
                ptr1++;
            }
            else if (height[ptr1] > height[ptr2]) {
                ptr2--;
            }
        }
        return max;
    }
}