class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 , j = nums.length-1;
        int a[] = new int[nums.length];
        for(int k = 0;k<nums.length;k++)
        {
            if(nums[k]%2==0)
            {
                a[i]=nums[k];
                i++;
            }
            else
            {
                a[j]=nums[k];
                j--;
            }
        }
        return a;
        
        
    }
}