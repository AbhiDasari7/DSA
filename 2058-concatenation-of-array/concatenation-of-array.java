class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[] = new int[2*nums.length];
        for(int i =0,j=nums.length;i<nums.length;i++,j++)
        {
            a[i]=nums[i];
            a[j]=nums[i];
        }
        return a;
        
    }
}