class Solution {
    public String reverseWords(String s) {
        String k = "";
        String a[] = s.split(" ");
        for(int i =0;i<a.length;i++)
        {
            String h = new StringBuilder(a[i]).reverse().toString();
            k=k+h+" ";
        }
        return k.substring(0,k.length()-1);

        
        
    }
}