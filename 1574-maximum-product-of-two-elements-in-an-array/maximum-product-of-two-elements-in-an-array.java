class Solution {
    public int maxProduct(int[] nums) {
        int m1=0,m2=0,pos=0;
        for(int i =0;i<nums.length;i++)
        if(nums[i]>m1){
        m1=nums[i];
        pos =i;
        }
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>m2&&i!=pos)
            m2=nums[i];
        }
        return (m1-1)*(m2-1);
        
    }
}