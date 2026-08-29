class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int k = nums[i];
            while(k>0)
            {
                int r = k%10;
                if(r==digit)
                c++;
                k = k/10;

            }
        }
        return c;
        
    }
}