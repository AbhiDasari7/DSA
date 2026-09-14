class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int c = 0;
        Arrays.sort(costs);
        for(int i =0;i<costs.length;i++)
        {
            if(costs[i]<=coins){
            coins = coins-costs[i];
            c++;
            }
            if(coins ==0)
            return c;
        }
        return c;
        
    }
}