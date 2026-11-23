// class ProductOfNumbers {
//     private List<Integer> nums;
//     private int n;
//     public ProductOfNumbers() {
//         nums=new ArrayList<>();
//         n=0;
//     }

//     public void add(int num) {
//         nums.add(num);
//     }
    
//     public int getProduct(int k) {
//         int p=1;
//         int n=nums.size();
//         for(int i=n-k;i<n;i++){
//             p*=nums.get(i);
//         }
//         return p;
//     }
// }

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

 class ProductOfNumbers {
    private List<Integer> nums;
    private int n;
    public ProductOfNumbers() {
        nums=new ArrayList<>();
        n=0;
    }

    public void add(int num) {
        if(num==0){
            nums.clear();
            n=0;
        }else{
            if(nums.isEmpty()){
                nums.add(num);
            }else{
                nums.add(nums.get(n-1)*num);
            }
            n++;
        }
    }
    
    public int getProduct(int k) {
        int n=nums.size();
        
        if(k>n) return 0;
        if(k==n) return nums.get(n-1);
        return nums.get(n-1)/nums.get(n-k-1);
    }
}

//done