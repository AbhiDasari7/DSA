class Solution {
    public int[] singleNumber(int[] nums) {
        int a[] = new int[2];
        HashMap<Integer,Integer> r = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            r.put(nums[i],r.getOrDefault(nums[i],0)+1);
        }
        int i =0;
        for(int x : r.keySet())
        {
            if(r.get(x)==1){
            a[i]=x;
            i++;
            }
            if(i>2)
            return a;
        }
        return a;
    }
}