class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int e = (nums.length-1)/2;
        int c=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[e]==nums[i])
            c++;
        }
        if(c==1)
        return true;
        else
        return false;
        
    }
}