class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        List<Integer> b = new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i]))
                a.put(nums[i],a.get(nums[i])+1);
            else 
            a.put(nums[i],1);            
        }
        for(Integer x: a.keySet())
        {
            if(a.get(x)>1)
            b.add(x);
        }
        return b;

        
    }
}