class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0;i<words.length;i++)
        {
            String k = new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(k))
            return words[i];
        }
        return "";
        
    }
}