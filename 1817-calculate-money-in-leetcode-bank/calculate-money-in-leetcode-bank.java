class Solution {
    public int totalMoney(int n) {
        int c  =1, r=0,d=0, store = 1;
        for(int i =1;i<=n;i++)
        {
            r=r+c;
            c++;
            d++;
            if(d%7==0)
            {
                c=store+1;
                store++;
                d=0;
            }


        }
        return r;

    }
}