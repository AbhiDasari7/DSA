class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1 , z = 0,pos = 0;;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            p=p*nums[i];
            else {
            z++;
            if(z==1)
            pos = i;
            }
        }
        if(z>1)
        {
            int a[] = new int[nums.length];
            return a;
        }
        if(z==1)
        {
            int a[] = new int[nums.length];
            a[pos]=p;
            return a;

        }
        else
        {
            int a[] = new int[nums.length];
            for(int i =0;i<a.length;i++)
            {
                a[i]=p/nums[i];
            }
            return a;
        }
        
        
    }
}