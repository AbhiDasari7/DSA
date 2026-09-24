class Solution {
    public String interpret(String command) {
        String r ="";
        char a[] = command.toCharArray();
        int i =0;
        while(i<a.length)
        {
            if(a[i]=='G'){
            r=r+"G";
            i++;
            }
            else if(a[i]=='('&&a[i+1]==')')
            {
                r = r+"o";
                i+=2;
            }
            else{
                r = r+"al";
                i+=4;
            }
        
        }
        return r;
        
    }
}