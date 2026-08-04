class Solution {
    public int missingNumber(int[] nums) {
        int c=0,d=0;
        int l = nums.length;
        for(int i=0;i<=l;i++)
        {
            c=0;
            for(int j =0;j<l;j++)
            {
                if(i==nums[j])
                c++;
            }
            if(c==0)
            d=i;

        }
        return d;
    }
}