class Solution {
    public int smallestNumber(int n, int t) {
        int x=n;
        while(true){
            if(product(x)%t==0) return x;
            x++;
        }
    }
    public int product(int x){
        int  val=1;
        while(x>0){
            int num=x%10;
            if(num==0) return 0;
            val*=num;
            x/=10;
        }
        return val;
    }
    
}