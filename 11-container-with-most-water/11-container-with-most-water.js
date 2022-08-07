/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let done = false;
    let left = 0;
    let right = height.length - 1;
    let area = (right - left) * Math.min(height[left], height[right]); 
    if (height.length == 2) return area; //Base case: arr length is 2
    while (!done) {
        if (height[left] < height[right]) left++;
        else right--;
        if (left == right) return area;
        const tempArea = (right-left) * Math.min(height[left], height[right]); //Recalculate area
        if (tempArea > area) area = tempArea; //If new area >, replace
    }    
};