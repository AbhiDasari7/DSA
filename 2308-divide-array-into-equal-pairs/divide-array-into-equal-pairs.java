class Solution {
    public boolean divideArray(int[] nums) {
        int a[] = new int[501];
        for(int i =0;i<nums.length;i++)
        a[nums[i]]++;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            return false;
        }
        return true;
        
    }
}