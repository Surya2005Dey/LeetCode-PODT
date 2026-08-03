// Sorting--Time-O(NlogN), space=O(1)
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int count=1;
//         for(int i=0;i<n-1;i++){
//             if(nums[i]==nums[i+1]) count++;
//             else 
//                 if(count>(n/2)) return nums[i];
//                 else count=1;
//         }

//         return count>(n/2)?nums[n-1]:0;
//     }
// }

// class Solution {
//     public int majorityElement(int[] nums) {

//         Arrays.sort(nums);

//         return nums[nums.length / 2];
//     }
// }

//HashMap-Time-O(N), space=O(N)
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map=new HashMap<>();
//         for(int num:nums){
//             map.put(num, map.getOrDefault(num,0)+1);
//             if (map.get(num) > nums.length / 2)
//                 return num;
//         }
//         return -1;
//     }
// }

//Moore's Voting Algorithm ----- Time=O(N), space=O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int  candidate=0;
        int  count=0;
        for(int num: nums){
            if(count==0) candidate=num;
            if(num==candidate) count++;
            else count--;
        }
       return candidate;
    }
}

//done