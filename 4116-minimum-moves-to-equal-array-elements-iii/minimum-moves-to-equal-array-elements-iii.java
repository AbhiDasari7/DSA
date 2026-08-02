class Solution {
    public int minMoves(int[] nums) {
        int m =0,c=0;
        for(int i=0;i<nums.length;i++)
        if(nums[i]>m)
        m=nums[i];
        for(int i =0;i<nums.length;i++)
        c = c+(m-nums[i]);
        return c;
        
    }
}