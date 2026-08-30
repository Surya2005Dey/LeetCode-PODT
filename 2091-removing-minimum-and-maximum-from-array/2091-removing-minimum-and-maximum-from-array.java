class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int minind=0;
        int maxind=0;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxind=i;
            }

            if(nums[i]<min){
                min=nums[i];
                minind=i;
            }
        }
        int left= Math.max(minind, maxind)+1;
        int right= n-Math.min(minind,maxind);
        int both= Math.min(minind, maxind) + 1 + n - Math.max(minind, maxind);
        
        return Math.min(Math.min(left,right),both);


    }
}
//done