// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         List<Integer> s= new ArrayList<>();
//         int i=nums[0];
//         int j= 0;
//         while(j<n){
//             if(nums[j]==i){
//                 j++;
//                 i++;
//             }else{
//                 s.add(i);
//                 i++;
                
//             }
            
//         }
//         return s;
//     }
// }


// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         List<Integer> s= new ArrayList<>();
//         HashSet<Integer> set=new HashSet<>();
//         int min=Integer.MAX_VALUE;
//         int max= Integer.MIN_VALUE;
//         for(int num: nums){
//             min=Math.min(min,num);
//             max=Math.max(max,num);
//             set.add(num);
//         }

//         for(int i=min;i<max;i++){
//             if(!set.contains(i)) s.add(i);
//         }
//         return s;
//     }
// }


class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> s= new ArrayList<>();
        boolean[] seen= new boolean[101];
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int num: nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
            seen[num]= true;
        }

        for(int i=min;i<=max;i++){
            if(!seen[i]) s.add(i);
        }
        return s;
    }
}


// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {

//         Arrays.sort(nums);

//         List<Integer> ans = new ArrayList<>();

//         for (int i = 1; i < nums.length; i++) {

//             for (int j = nums[i - 1] + 1; j < nums[i]; j++) {
//                 ans.add(j);
//             }
//         }

//         return ans;
//     }
// }