class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer>a = new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        a.add(nums[i]);
        int i = k;
        int c = 1;
        while(true)
        {
            if(a.contains(i*c))
            c++;
            else
            return i*c;
        }
            
    }
}