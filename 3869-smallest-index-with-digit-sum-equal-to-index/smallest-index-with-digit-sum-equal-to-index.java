class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int d =0;
            while(nums[i]>0)
            {
                int k = nums[i]%10;
                d=d+k;
                nums[i]/=10;
            }
            if(i==d)
            return i;
        }
        return -1;
        
    }
}