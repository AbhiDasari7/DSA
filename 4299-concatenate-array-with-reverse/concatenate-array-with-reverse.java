class Solution {
    public int[] concatWithReverse(int[] nums) {
        int a[] = new int[2*nums.length];
        for(int i =0,j=a.length-1;i<nums.length;i++,j--)
        {
            a[i]=nums[i];
            a[j]=nums[i];
        }
        return a;
        
    }
}