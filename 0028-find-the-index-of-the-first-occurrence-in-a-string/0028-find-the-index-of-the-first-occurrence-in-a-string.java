class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}


// class Solution {
//     public int strStr(String haystack, String needle) {
//         boolean occ= haystack.contains(needle);
//         return occ==true?haystack.indexOf(needle):-1;
//     }
// }
//done