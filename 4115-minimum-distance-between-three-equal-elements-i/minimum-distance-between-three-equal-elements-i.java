class Solution {
    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        if(n==1||n==2)
        return -1;
        int c = 0;

        for(int i = 0;i<n-2;i++)
        {
            for(int j = i+1;j<n-1;j++)
            {
                for(int k = j+1;k<n;k++)
                {
                    if(nums[i]==nums[j]&&nums[j]==nums[k]){
                    int m = Math.abs(i-j)+Math.abs(i-k)+Math.abs(j-k);
                    if(m<min)
                    min = m;
                    c++;
                    }
                }
            }
        }
        if(c==0)
        return -1;
        return min;
        
    }
}