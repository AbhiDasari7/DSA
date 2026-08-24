class Solution {
    public int gcdOfOddEvenSums(int n) {
        int i = 1 , j = 2,se=2,so=1;
        int c =0;
        while(c<n-1)
        {
            
            i+=2;
            j+=2;
            c++;
            so+=i;
            se+=j;
        }
        while(so!=0)
        {
            int temp = so;
            so = se%so;
            se = temp;
        }
        return se;
        
    }
}