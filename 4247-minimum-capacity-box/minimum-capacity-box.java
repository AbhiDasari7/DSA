class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int pos = -1, min = 100;
        for(int i =capacity.length-1;i>=0;i--)
        {
            if(capacity[i]>= itemSize&&capacity[i]<=min)
            {
                min = capacity[i];
                pos = i;
            }
        }
        return pos;
        
    }
}