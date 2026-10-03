class Solution {
    public int[] minOperations(String boxes) {
        int a[] = new int[boxes.length()];
        char b[] = boxes.toCharArray();
        int s = 0;
        for(int i =0;i<b.length;i++)
        {
            s = 0;
            for(int j =0;j<b.length;j++)
            {
                if(b[j]=='1')
                s = s+Math.abs(i-j);
            }
            a[i]=s;
        }
        return a;
        
        
    }
}