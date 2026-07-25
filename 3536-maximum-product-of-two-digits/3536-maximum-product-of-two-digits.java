class Solution {
    public int maxProduct(int n) {
        int max1 = -1, max2 = -1;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }
        return max1 * max2;
    }
}


// class Solution {
//     public int maxProduct(int n) {
//        String s= String.valueOf(n);
//        char[] chars=s.toCharArray();
//        Arrays.sort(chars);
//        String sorted= new String(chars);
//        int len=sorted.length();
//       int fh = sorted.charAt(len - 1) - '0'; 
//       int sh = sorted.charAt(len - 2) - '0'; 
//       return fh * sh;

//     }
// }

// class Solution {
//     public int maxProduct(int n) {
//        List<Integer> digit =new ArrayList();
//        int temp=n;
//        while(temp>0){
//         int dig= temp%10;
//         digit.add(dig);
//         temp=temp/10;
//        }
//        Collections.sort(digit);
//        int length = digit.size();
//        return digit.get(length-1)*digit.get(length-2);

//     }
// }




