/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a,b)=>a-b); //Sort array
    const tripArr = [];
    const foundNums = new Set();
    //Only loop till the last 3rd element
    for (let i = 0; i < nums.length-2; i++) {
        //Only perform if current index is not unique
        if (!foundNums.has(nums[i])) {
            foundNums.add(nums[i]); //Add to unique set of numbers
            let r = nums.length - 1;
            let l = i+1;
            const lSet = new Set(); //Track unique numbers from pointers
            const rSet = new Set();
            while(r > l) {
                //If adds up to 0 and numbers unique
                if (nums[i] + nums[l] + nums[r] === 0 && !lSet.has(nums[l]) && !rSet.has(nums[r])) {
                    tripArr.push([nums[i],nums[l],nums[r]]); //Add 3 numbers to the array
                    l++ //Increment left pointer
                }
                //If does not add up to 0, just move the pointers depending on conditions
                if (nums[i] + nums[l] + nums[r] > 0) {
                    rSet.add(nums[r]);
                    r--;
                }
                else {
                    lSet.add(nums[l]);
                    l++;
                }      
            }
        }
    }
    return tripArr;    
};