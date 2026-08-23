class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a[] = new int[nums.length];
        int i = 0 , j = 1;
        for(i= 0,j=1 ;i<nums.length-1;i+=2,j+=2){
        a[i]=nums[j];
        a[j] = nums[i];
        }
        return a;
        
    }
}