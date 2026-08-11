class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        while(n>0)
        {
            int k = n%10;
            a.add(k);
            n=n/10;
        }
        int m=0;
        for(int i=0;i<a.size()-1;i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                if(a.get(i)*a.get(j)>m)
                m=a.get(i)*a.get(j);
            }
        }
        return m;
        
    }
}