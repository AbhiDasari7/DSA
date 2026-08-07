class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n = x;
        int d = 0;
        while(x>0)
        {
            d=d+x%10;
            x=x/10;
        }
        if(n%d==0)
        return d;
        return -1;
        
    }
}