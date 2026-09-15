class Solution {
    public void sortColors(int[] nums) {
        int z = 0 , o = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]==0)
            z++;
            if(nums[i]==1)
            o++;
        }
        int i = 0;
        while(i<z)
        {
            nums[i]=0;
            i++;
        }
        while(i<z+o)
        {
            nums[i]=1;
            i++;
        }
        while(i<nums.length)
        {
            nums[i]=2;
            i++;
        }

        
        
        
    }
}