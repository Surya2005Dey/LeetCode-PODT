class Solution {
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int[] preGcd= new int[n];
        long sum=0;
        int maxnum=nums[0];
        for(int i=0;i<n;i++){
            if( nums[i]>maxnum) maxnum=nums[i];
            preGcd[i]= gcd(nums[i], maxnum);
        }
        Arrays.sort(preGcd);

        for(int i=0;i<n/2;i++){
            sum+= gcd(preGcd[i], preGcd[n-i-1]);
        }
        return sum;

    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}