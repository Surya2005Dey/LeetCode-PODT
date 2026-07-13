class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result= new ArrayList<>();
        String s="123456789";
        int l=(int)Math.floor(Math.log10(low)) + 1;
        int h= (int)Math.floor(Math.log10(high)) + 1;
        for(int i=l;i<=h;i++){
            for(int j=0;j<=(9-i);j++){
                int num= Integer.parseInt(s.substring(j,j+i));
                if(num>=low && num<=high){
                    result.add(num);
                }
            }
        }
    return result; 
}
}
//done