class Solution {
    public int countPartitions(int[] nums) {
        int s = 0,c=0;
        for(int i =0;i<nums.length;i++)
        s = s+nums[i];
        int s1 = 0;
        for(int i =0;i<nums.length-1;i++)
        {
            s1=s1+nums[i];
            s-=nums[i];
            if((s-s1)%2==0)
            c++;
        }
        return c;
        
    }
}