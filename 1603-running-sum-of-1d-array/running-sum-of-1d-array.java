class Solution {
    public int[] runningSum(int[] nums) {
        int a[] = new int[nums.length];
        int s =0;
        for(int i =0;i<nums.length;i++)
        {
            s=0;
            for(int j=0;j<=i;j++)
            {
                s=s+nums[j];
            }
            a[i]=s;

        }
        return a;
    }
}