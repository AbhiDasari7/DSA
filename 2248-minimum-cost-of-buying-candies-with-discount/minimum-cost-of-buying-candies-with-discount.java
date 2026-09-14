class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int c = 0,r=0;
        for(int i =cost.length-1;i>=0;i--)
        {
            c = c+cost[i];
            r++;
            if(r%2==0)
            {
                i--;
                r=0;
            }
        }
        return c;
        
    }
}