class Solution {
    public String reverseOnlyLetters(String s) {
        char a[] = s.toCharArray();
        int i = 0 , j = a.length-1;
        while(i<j)
        {
            if(Character.isLetter(a[i])&&Character.isLetter(a[j]))
            {
                char t = a[i];
                a[i]=a[j];
                a[j] = t;
                i++;
                j--;
            }
            else if(!(Character.isLetter(a[i])))
            i++;
            else
            j--;
        }
        String r = String.valueOf(a);
        return r;
        
        
    }
}