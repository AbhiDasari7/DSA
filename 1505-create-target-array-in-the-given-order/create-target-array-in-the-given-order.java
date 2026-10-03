class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        a.add(index[i],nums[i]);
        int b[] = new int[nums.length];
        for(int i =0;i<b.length;i++)
        b[i]=a.get(i);
        return b;
        
    }
}