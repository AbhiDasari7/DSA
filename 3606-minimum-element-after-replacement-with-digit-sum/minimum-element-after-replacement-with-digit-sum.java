class Solution {
    public int minElement(int[] nums) {
        int a[] = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            int s = 0;
            while(nums[i]>0)
            {
                s = s+nums[i]%10;
                nums[i]=nums[i]/10;
           }
           a[i] = s;

        }
        int min =a[0];
        for(int i =0;i<nums.length;i++)
        if(a[i]<min)
        min = a[i];
        return min;
        
    }
}