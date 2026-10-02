class Solution {
    public boolean findSubarrays(int[] nums) {
        for(int i=0,j=i+1;i<nums.length-2;i++,j++)
        {
            for(int k = i+1,l=k+1;l<nums.length;k++,l++)
            {
                if(nums[i]+nums[j]==nums[k]+nums[l])
                return true;
            }
        }
        return false;

        
    }
}