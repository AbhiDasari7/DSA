class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        List<Integer> a  = new ArrayList();
        int c =0;
        for(int i =0;i<nums.length-1;i++)
        {
            c=0;
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                c++;
            }
            if(c==1)
            a.add(nums[i]);
        }
        int x =0;
        for(int i =0;i<a.size();i++)
        {
            x = x^a.get(i);

        }
        return x;
        
    }
}