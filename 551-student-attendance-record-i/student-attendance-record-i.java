class Solution {
    public boolean checkRecord(String s) {
        int c = 0, m=0 , a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            a++;
            if(s.charAt(i)=='L')
            c++;
            else
            c=0;
            if(c>m)
            m=c;
        }
        if(a<2&&m<3)
        return true;
        return false;
        
    }
}