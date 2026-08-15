class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        
        for (int num : nums) {
            xor ^= num;
        }
        
        if (xor != 0) {
            return n; 
        }
        
        boolean allZero = true;
        for (int num : nums) {
            if (num != 0) {
                allZero = false;
                break;
            }
        }
        
        return allZero ? 0 : n - 1;
    }
}

//done