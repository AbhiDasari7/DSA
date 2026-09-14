class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)
        return 0;
        int s = 0;
        String a1 = Integer.toString(n);
        StringBuilder a = new StringBuilder();
        for(int i =0;i<a1.length();i++)
        {
            if(a1.charAt(i)!='0'){
            a.append(a1.charAt(i));
            }
        }
        String r = a.toString();
        long k = Long.parseLong(r);
        while(n>0)
        {
            int h = n%10;
            s = s+h;
            n = n/10;
        }
        return k*s;



    
    
        
    }
}