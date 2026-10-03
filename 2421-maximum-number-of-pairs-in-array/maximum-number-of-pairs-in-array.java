class Solution {
    public int[] numberOfPairs(int[] nums) {
        int a[] = new int[101];
        int b[] = new int[2];
        int c = 0 , d = 0;
        for(int i =0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        for(int i =0;i<a.length;i++)
        {
            c = c+(a[i]/2);
            d = d+(a[i]%2);
        }
        b[0]=c;
        b[1]=d;
        return b;
        
    }
}