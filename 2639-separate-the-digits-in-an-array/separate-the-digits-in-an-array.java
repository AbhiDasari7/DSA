class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for(int i =nums.length-1;i>=0;i--)
        {
            while(nums[i]>0)
            {
                int k = nums[i]%10;
                a.add(k);
                nums[i]/=10;
            }
        }
        int b[] = new int[a.size()];
        for(int i=0,j=a.size()-1;i<b.length;i++,j--)
        {
            b[i]=a.get(j);
        }
        return b;
        
        
    }
}