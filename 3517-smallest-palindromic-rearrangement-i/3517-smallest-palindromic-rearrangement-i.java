class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char[] chars = s.toCharArray();
        Arrays.sort(chars, 0, mid);
        for(int i=0;i<mid;i++){
            chars[n-i-1]=chars[i];
        }
        return new String(chars);
    }
}


// class Solution {
//     public String smallestPalindrome(String s) {
//         int[] freq = new int[26];
//         for (char c : s.toCharArray()) {
//             freq[c - 'a']++;
//         }
//         StringBuilder half = new StringBuilder();
//         char middle = 0;
//         for (int i = 0; i < 26; i++) {
//             if (freq[i] % 2 == 1) {
//                 middle = (char) (i + 'a'); 
//             }
//             for (int j = 0; j < freq[i] / 2; j++) {
//                 half.append((char) (i + 'a'));
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         result.append(half);
//         if (middle != 0) result.append(middle);
//         result.append(half.reverse());

//         return result.toString();
//     }
// }
