class Solution {
    public int getLeastFrequentDigit(int n) {
        int a[] = new int[10];
        while(n>0)
        {
            int k = n%10;
            a[k]++;
            n=n/10;
        }
        int r = 50;
        int f =  50;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]<f&&a[i]!=0)
            {
                f = a[i];
                r = i;
            }
        }
        return r;
    

        

        
        
        
    }
}