// RECURSION+MEMORIZATION
class Solution {
    int cp=Integer.MAX_VALUE;
    int[][] t;
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] copies=new int[n];
        for(int i=0;i<n;i++){
            int copy=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(items[j][0]%items[i][0]==0) copy++;
            }
            copies[i]=copy;
            cp=Math.min(cp,items[i][1]);
        }

        t = new int[n + 1][budget + 1];
        for (int[] row : t)
            Arrays.fill(row, -1);

        return solve(n, items,budget,copies);
    }
    public int solve(int n, int[][]items, int budget ,int[] copies){
        if(n==0) return budget/cp;
        if(t[n-1][budget]!=-1) return t[n-1][budget];
        int take=0;
        int skip=0;

        int price=items[n-1][1];

        if(budget>=price){
            take=1+copies[n-1]+solve(n-1,items,budget-price,copies);
        }

        skip=solve(n-1,items,budget,copies);

        return t[n-1][budget]=Math.max(skip,take);
        }
}


//BOTTOM UP APPROACH
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int cp=Integer.MAX_VALUE;
        int n=items.length;
        int[] copies=new int[n];
        for(int i=0;i<n;i++){
            int copy=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(items[j][0]%items[i][0]==0) copy++;
            }
            copies[i]=copy;
            cp=Math.min(cp,items[i][1]);
        }

        int[][] t = new int[n + 1][budget + 1];
        for (int b = 0; b <= budget; b++)
            t[0][b] = b / cp;
        
        for(int i=1;i<=n;i++){
            for(int b=0;b<=budget;b++){
                int take=0;
                int skip=0;
                int price=items[i-1][1];

                if(b>=price){
                    take=1+copies[i-1]+t[i-1][b-price];
                }

                skip=t[i-1][b];
                t[i][b]=Math.max(skip,take);
            }
        }
       

        return t[n][budget];
        }
}
