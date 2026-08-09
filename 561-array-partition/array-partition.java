class Solution {
    public int arrayPairSum(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        a.add(nums[i]);
        Collections.sort(a);
        int c =0;
        for(int i =0;i<nums.length;i+=2)
        {
            c=a.get(i)<=a.get(i+1)?c+a.get(i):c+a.get(i+1);
        }
        return c;

        
    }
}