class Solution {
    public boolean consecutiveSetBits(int n) {
        String s = Integer.toBinaryString(n);
        int c =0;
        for(int i =0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='1'&&s.charAt(i+1)=='1')
            c++;
        }
        if(c==1)
        return true;
        return false;
        
    }
}