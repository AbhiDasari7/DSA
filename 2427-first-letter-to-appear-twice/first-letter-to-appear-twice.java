class Solution {
    public char repeatedCharacter(String s) {
        char a[] = s.toCharArray();
        List <Character> b = new ArrayList<>();
        for(int i =0;i<a.length;i++)
        {
            if(b.contains(a[i]))
            return a[i];
            else
            b.add(a[i]);
        }
        return 'a';
        
    }
}