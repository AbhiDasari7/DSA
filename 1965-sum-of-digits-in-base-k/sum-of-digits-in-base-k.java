class Solution {
    public int sumBase(int n, int k) {
        String a = Integer.toString(n,k);
        char b[] =a.toCharArray();
        int c = 0;
        for(int i =0;i<b.length;i++)
        {
            c = c+(b[i]-'0');
        } 
        return c;

        
    }
}