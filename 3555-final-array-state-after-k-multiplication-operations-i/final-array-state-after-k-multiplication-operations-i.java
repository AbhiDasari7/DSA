class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int c=0;
        while(c<k)
        {
            int min = nums[0],pos=0;
            for(int i =0;i<nums.length;i++)
            {
                if(nums[i]<min){
                min = nums[i];
                pos = i;
                }

            }
            nums[pos]=nums[pos]*multiplier;
            c++;
        }
        return nums;

        
    }
}