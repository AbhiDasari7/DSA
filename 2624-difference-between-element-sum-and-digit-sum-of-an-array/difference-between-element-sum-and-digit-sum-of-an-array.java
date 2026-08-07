class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0;
        for(int i =0;i<nums.length;i++)
        a=a+nums[i];
        int d =0;
        for(int i =0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                d=d+nums[i]%10;
                nums[i]/=10;
            }
        }
        return d-a>=0?d-a:a-d;
        
    }
}