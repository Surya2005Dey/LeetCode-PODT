class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=nums[n-1]-nums[2];
        diff=Math.min(diff,nums[n-3]-nums[0]);
        diff=Math.min(diff, nums[n-2]-nums[1]);
        //low always 0 because 2 num is same , and chenging 2 elements to amke min score has 3 condition , atfirst sort the array, then 1) 0th and 1th  index elemnet be copy of 3rh element , 2) 0th element will cahnge and copy to 1st elememt and nth element will copy to n-1 th element , 3) n-1 & n  th element will copy to n-2 element 
        return diff;
    }
}