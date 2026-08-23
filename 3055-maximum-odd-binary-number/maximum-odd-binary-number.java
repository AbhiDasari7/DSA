class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c = 0;
        int i =0;
        for( i = 0;i<s.length();i++)
        if(s.charAt(i)=='1')
        c++;
        c=c-1;
        String k = "";
        for( i = 0;i<c;i++)
       k =  k+"1";
        for(i=c;i<s.length()-1;i++)
        k=k+"0";
        k = k+"1";
        return k;
        

        
    }
}