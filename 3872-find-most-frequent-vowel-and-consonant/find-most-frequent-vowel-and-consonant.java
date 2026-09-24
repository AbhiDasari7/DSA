class Solution {
    public int maxFreqSum(String s) {
        HashMap <Character , Integer> c = new HashMap<>();
        HashMap <Character , Integer> v = new HashMap<>();
        char a[] = s.toCharArray();
        for(int i =0;i<a.length;i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            v.put(a[i],v.getOrDefault(a[i],0)+1);
            else
            c.put(a[i],c.getOrDefault(a[i],0)+1);
        }
        int m1 = 0 , m2 = 0;
        for(char ch: v.keySet())
        {
            if(v.get(ch)>m1)
            m1 = v.get(ch);
        }
        for(char ch :c.keySet())
        {
            if(c.get(ch)>m2)
            m2 = c.get(ch);
        }
        return m1+m2;
    }
}