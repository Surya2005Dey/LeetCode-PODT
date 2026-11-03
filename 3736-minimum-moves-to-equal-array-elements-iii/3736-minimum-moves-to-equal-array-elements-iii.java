class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[max]) max=i;
        }
        int count=0;
        for(int i=0;i<n;i++){
            count+=nums[max]-nums[i];
        }
        return count;
    }
}
//done