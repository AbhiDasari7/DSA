class Solution {
    public int minimumFlips(int n) {
        String a = Integer.toBinaryString(n);
        int i =0 , j = a.length()-1;
        int c=0;
        while(i<a.length())
        {
            if(a.charAt(i)!=a.charAt(j))
            c++;
            i++;
            j--;
        }
        return c;
        
    }
}