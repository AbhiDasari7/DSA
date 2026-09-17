class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char a[] = s.toCharArray();
        for(int i =0;i<a.length;i++)
        {
            if(a[i]=='6')
            {
                a[i]='9';
                break;
            }
        }
        String r = String.valueOf(a);
        int re = Integer.parseInt(r);
        return re;
        
        
        

        
    }
}