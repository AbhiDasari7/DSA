class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int r[] = new int[2];
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++)
        {
            if(a.containsKey(nums[i]))
            {
                a.put(nums[i],a.get(nums[i])+1);
            }
            else 
                a.put(nums[i],1);
        }
        int m = 0;
        for(int x: a.keySet())
        {
            if(a.get(x)==2)
            {
                r[m]=x;
                m++;
            }

        }
        return r;
        
        
        
    }
}