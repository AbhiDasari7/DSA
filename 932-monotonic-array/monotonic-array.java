class Solution {
    public boolean isMonotonic(int[] nums) {
        int l  = 0 , r = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>=nums[i+1])
            l++;
            if(nums[i]<=nums[i+1])
            r++;
        }
        if(r==(nums.length-1)||l==(nums.length-1))
        return true;
        return false;
        
    }
}