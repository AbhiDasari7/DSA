class Solution {
    public String convertToBase7(int num) {
        if(num==0)
        return "0";
        int c = num>0?num:-num;
        int d = num>=0?1:0;
        String s = "";
        while(c>0)
        {
            int k = c%7;
            s=s+k;
            c = c/7;
        }
        char a[] = s.toCharArray();
        int i = 0 , j = a.length-1;
        while(i<j)
        {
            char t = a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        String r = String.valueOf(a);
        if(d==0)
        {
            String k = "-"+r;
            return k;
        }
        return r;

        
        
        
    }
}