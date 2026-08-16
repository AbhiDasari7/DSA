class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i]))
            a.put(nums[i],a.get(nums[i])+1);
            else
            a.put(nums[i],1);
        }
        int m =0;
        for(Integer x: a.keySet())
        {
            if(a.get(x)>m)
            m = a.get(x);
        }
        int c =0;
        for(Integer x: a.keySet())
        {
            if(a.get(x)==m)
            c+=a.get(x);
        }
        return c;

        
    }
}