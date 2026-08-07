class Solution {
    public int countAsterisks(String s) {
        int a=0,c=0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='*'&&c%2==0)
            a++;
            if(s.charAt(i)=='|')
            c++;
        }
        return a;
        
    }
}