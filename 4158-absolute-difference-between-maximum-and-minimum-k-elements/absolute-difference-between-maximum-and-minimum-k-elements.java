class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        int s1 = 0 , s2 = 0;
        for(int c = 1;c<=k;c++)
        {
            s1 = s1 +nums[i];
            i++;
            s2 = s2+nums[j];
            j--;
        }
        return Math.abs(s1-s2);
        
    }
}