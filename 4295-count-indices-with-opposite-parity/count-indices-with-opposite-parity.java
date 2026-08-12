class Solution {
    public int[] countOppositeParity(int[] nums) {
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            int k = nums[i]%2;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]%2!=k)
                c++;
            }
            a[i]=c;
        }
        return a;
        
    }
}