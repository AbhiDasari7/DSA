class Solution {
    public int findMaxK(int[] nums) {
        if(nums.length==1)
        return -1;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        a.add(nums[i]);
        Collections.sort(a);
        int i =0;
        while(i<nums.length)
        {
            if(a.contains(a.get(i))&&a.contains(-a.get(i)))
            return -a.get(i);
            i++;
        }
        return -1;
        
    }
}