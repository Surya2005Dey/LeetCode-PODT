class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        List<Integer> zero = new ArrayList<>();
        int activeCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') activeCount++;
        }

        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
               int start=i;
                while(i<s.length()&& s.charAt(i)=='0') i++;
                zero.add(i-start);
            }
            else{
                i++;
            }
        }
     
        int maxNum=0;
        for(int j=0;j<zero.size()-1;j++){
            int sum= zero.get(j)+zero.get(j+1);
            maxNum= Math.max(sum, maxNum);
        }

        return maxNum+activeCount;
    }
}
//done