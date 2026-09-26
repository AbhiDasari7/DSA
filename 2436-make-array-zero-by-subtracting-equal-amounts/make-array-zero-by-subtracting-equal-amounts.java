class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }    
        return a.size();    
    }
}