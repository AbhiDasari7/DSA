class Solution {
    public int maxDistinct(String s) {
        List <Character> a = new ArrayList<>();
        char ch[] = s.toCharArray();
        for(int i =0;i<ch.length;i++)
        {
            if(!(a.contains(ch[i])))
            {
                a.add(ch[i]);
            }
        }
        return a.size();
        
        
    }
}