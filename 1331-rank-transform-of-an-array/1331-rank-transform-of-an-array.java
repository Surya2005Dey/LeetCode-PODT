class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] result= new int[n];
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        Integer[] uniqueArray = uniqueNumbers.toArray(new Integer[0]);
        Arrays.sort(uniqueArray);

        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < uniqueArray.length; i++) {
            rankMap.put(uniqueArray[i], i + 1); 
        }
        for(int i=0;i<n;i++){
            result[i]=rankMap.get(arr[i]);

        }
        return result;
    }
}

//OR

// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         int[] sorted = arr.clone();
//         Arrays.sort(sorted);

//         Map<Integer, Integer> rankMap = new HashMap<>();
//         int rank = 1;
//         for (int num : sorted) {
//             if (!rankMap.containsKey(num)) {
//                 rankMap.put(num, rank++);
//             }
//         }

//         int[] result = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             result[i] = rankMap.get(arr[i]);
//         }

//         return result;
//     }
// }
