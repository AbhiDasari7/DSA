class Solution {
    public int minimumSwaps(int[] nums) {
        int k =0;
        for(int i=0;i<nums.length;i++)
        if(nums[i]==0)
        k++;
        int c=0;
        for(int i=nums.length-1,j=k;j>0;i--,j--)
        {
            if(nums[i]!=0)
            c++;
        }
        return c;
        

        
    }
}