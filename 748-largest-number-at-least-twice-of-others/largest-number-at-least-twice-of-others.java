class Solution {
    public int dominantIndex(int[] nums) {
        int m = 0,m1=0,p=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>m){
        m = nums[i];
        p=i;
        }
        }
        for(int i = 0;i<nums.length;i++){
        if(nums[i]>m1&&nums[i]!=m){
        m1 = nums[i];
        }
        }
        if(m>=2*m1)
        return p;
        return -1;
        
        
    }
}