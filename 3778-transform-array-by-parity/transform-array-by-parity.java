class Solution {
    public int[] transformArray(int[] nums) {
        int c=0;
        int a[] = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            c++;
        }
        for(int i =c;i<nums.length;i++)
        a[i]=1;
        return a;
        
    
    }
}