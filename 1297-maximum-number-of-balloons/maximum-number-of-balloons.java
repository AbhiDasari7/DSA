class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0 , a = 0 , l = 0 , o = 0 , n = 0;
        char c[] = text.toCharArray();
        for(int i =0;i<c.length;i++)
        {
            if(c[i]=='b')
            b++;
            if(c[i]=='a')
            a++;
            if(c[i]=='l')
            l++;
            if(c[i]=='o')
            o++;
            if(c[i]=='n')
            n++;
        }
        o = o/2;
        l= l/2;
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,Math.min(l,n)))));

        
    }
}