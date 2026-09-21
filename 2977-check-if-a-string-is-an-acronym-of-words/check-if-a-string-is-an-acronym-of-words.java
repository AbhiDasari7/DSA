class Solution {
    public boolean isAcronym(List<String> words, String s) {
        char a[] = s.toCharArray();
        if(a.length!=words.size())
        return false;
        for(int i =0;i<words.size();i++)
        {
            String k = words.get(i);
            if(k.charAt(0)!=a[i])
            return false;
        }
        return true;
    }
}