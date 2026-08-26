class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        List<Integer> a = new ArrayList<>();
        int i =0;
        while(i<nums.length)
        {
            if(nums[i]!=val)
            {
                a.add(nums[i]);
                c++;
            }
            i++;
        }
        for( i = 0;i<c;i++)
        nums[i] = a.get(i);
        return c;


        
    }
}