class Solution {
    public String generateTheString(int n) {
        String s = "";
        if(n%2!=0)
        {
            for(int i =1;i<=n;i++)
            s=s+"a";
            return s;
        }
        else 
        {
            for(int i =1;i<=n-1;i++)
            s=s+"a";
            s=s+"b";
            return s;
        }
        
        
    }
}