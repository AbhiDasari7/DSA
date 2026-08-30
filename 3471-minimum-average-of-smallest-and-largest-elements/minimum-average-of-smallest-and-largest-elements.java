class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i =0 , j = nums.length-1;
        double m = Integer.MAX_VALUE;
        for(int k = 0;k<nums.length/2;k++)
        {
            if((nums[i]+nums[j])/2<m)
            m = ((double)nums[i]+(double)nums[j])/2;
            i++;
            j--;
        }
        return m;
        
    }
}