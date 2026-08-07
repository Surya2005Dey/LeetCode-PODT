class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list= new ArrayList<>();
        int n=nums.length;
        if (n == 0) return list;
        int start=nums[0];
        for(int i=1;i<=n;i++){
            if(i==n || nums[i]-1!=nums[i-1]){
                if(start==nums[i-1]){
                   list.add(String.valueOf(start));
                }else{
                    list.add(start+"->"+nums[i-1]);
                }

                if(i<n) start=nums[i];
            }
            
        }
        return list;
    }
}

//done