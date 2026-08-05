// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> map= new HashMap<>();

//         for(int num: nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//             if(map.get(num)>=2) return true;
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int count=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]) return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();

        for(int num: nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}