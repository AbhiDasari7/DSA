class Solution {
    public String largestEven(String s) {
        int l = s.length();
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0'||s.charAt(i)=='2'||s.charAt(i)=='4'||s.charAt(i)=='6'||s.charAt(i)=='8')
            return s.substring(0,i+1);
        }
        return "";
        
    }
}