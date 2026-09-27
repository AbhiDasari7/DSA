class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        a.add(nums[i]);
        boolean b = true;
        while(b)
        {
            if(a.contains(original))
            original = 2*original;
            else
            {
                b = false;
                return original;
            }
        }
        return 0;
        
    }
}