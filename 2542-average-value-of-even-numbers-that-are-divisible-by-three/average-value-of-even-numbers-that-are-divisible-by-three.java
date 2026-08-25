class Solution {
    public int averageValue(int[] nums) {
        int c = 0 , s = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]%6==0)
            {
                s=s+nums[i];
                c++;
            }
        }
        if(c!=0)
        return s/c;
        return 0;
        
    }
}