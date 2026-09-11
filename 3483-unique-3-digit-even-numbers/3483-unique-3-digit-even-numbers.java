// class Solution {
//     public int totalNumbers(int[] digits) {
//         Set<Integer> set= new HashSet<>();
//         int n=digits.length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 for(int k=0;k<n;k++){
//                     if(i==j||j==k||k==i) continue;
//                     int res= digits[i]*100+digits[j]*10+digits[k];
//                     if(res>=100 && res%2==0) set.add(res);
//                 }
//             }
//         }
//         return set.size();
//     }
// }

class Solution {
    public int totalNumbers(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        for (int i = 1; i <= 9; i++) {
            if (freq[i] == 0) continue;
            freq[i]--;

            for (int j = 0; j <= 9; j++) {
                if (freq[j] == 0) continue;
                freq[j]--;

                for (int k = 0; k <= 8; k += 2) { // Only even digits
                    if (freq[k] == 0) continue;
                    freq[k]--;

                    int num = i * 100 + j * 10 + k;
                    result.add(num);

                    freq[k]++;
                }

                freq[j]++;
            }

            freq[i]++;
        }

      

        return result.size();
    }
}