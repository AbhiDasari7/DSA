class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        String b ="";
        for(int i =0;i<a.length();i++)
        {
            if(a.charAt(i)=='1')
            b=b+"0";
            else
            b = b+"1";
        }
        int r = Integer.parseInt(b,2);
        return r; 
        
    }
}