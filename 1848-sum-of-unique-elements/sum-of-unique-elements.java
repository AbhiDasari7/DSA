class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i]))
            a.put(nums[i],a.get(nums[i])+1);
            else
            a.put(nums[i],1);
        }
        int c = 0;
        for(Integer k : a.keySet())
        {
            if(a.get(k)==1)
            c=c+k;
        }
        return c;
        
    }
}