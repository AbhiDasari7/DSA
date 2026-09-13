class Solution {
    public boolean isBalanced(String num) {
        int s = 0;
        char [] a = num.toCharArray();
        for(int i = 0;i<a.length;i++)
        {
            if(i%2==0)
            s = s+(a[i]-'0');
            else
            s = s-(a[i]-'0');
        }
        if(s!=0)
        return false;
        return true;
    }
}