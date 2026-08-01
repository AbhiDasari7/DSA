class Solution {
    public int countDigits(int num) {
        int c=0,d=num;
        while(num>0)
        {
            int k = num%10;
            if(d%k==0)
            c++;
            num = num/10;
        }
        return c;
    }
}