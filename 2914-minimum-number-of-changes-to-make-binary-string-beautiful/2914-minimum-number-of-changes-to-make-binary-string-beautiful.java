class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i+=2){// min even no is 2 , so if we chevk min even means 2 no substring and check then its will give min count 
            if(s.charAt(i)!=s.charAt(i+1)) count++;
        }
        return count;
    }
}

// class Solution {
//     public int minChanges(String s) {
//         char curr = s.charAt(0);

//         int count = 0;
//         int changes = 0;
//         int n = s.length();

//         for (int i = 0; i < n; i++) {
            
//             if (s.charAt(i) == curr) {
//                 count++;
//                 continue;
//             }

//             if (count % 2 == 0) {
//                 count = 1;
//             } else {
//                 count = 0;
//                 changes++;
//             }
//             curr = s.charAt(i);
//         }

//         return changes;
//     }
// }
