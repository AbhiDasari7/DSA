class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]==10||bills[0]==20)
        return false;
        int c5 = 0 , c10 = 0;
        for(int i =0;i<bills.length;i++)
        {
            if(bills[i]==5)
            c5++;
           else  if(bills[i]==10&&c5>0)
            {
                c5--;
                c10++;
            }
            else
            {
                if(c5>0&&c10>0)
                {
                    c10--;
                    c5--;
                }
                else if(c5>=3)
                {
                    c5-=3;
                }
                else
                return false;
            }
            
        }
        return true;
        
    }
}