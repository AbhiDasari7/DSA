class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(int x: a.keySet())
        {
            if(a.get(x)>1)
            return x;
        }
        return 2;
    }
}