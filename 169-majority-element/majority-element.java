class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i]))
                a.put(nums[i],a.get(nums[i])+1);
            else
            a.put(nums[i],1);
        }
        int m =0,n=0;
        for(int x: a.keySet())
        {
            if(a.get(x)> m){
            m = a.get(x);
            n = x;
            }
        }
        return n;
    }
}