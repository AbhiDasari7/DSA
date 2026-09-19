class Solution {
    public String trimTrailingVowels(String s) {
        char a[] = s.toCharArray();
        int i = a.length-1;
        while(i>=0)
        {
            if(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u')
            return s.substring(0,i+1);
            else
            i--;
        }
        return "";
        
    }
}