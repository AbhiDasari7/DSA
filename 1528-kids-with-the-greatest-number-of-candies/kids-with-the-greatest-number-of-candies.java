class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> a = new ArrayList<>();
        int m = 0;
        for(int i =0;i<candies.length;i++)
        if(candies[i]>m)
        m = candies[i];
        for(int i =0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies<m)
            a.add(false);
            else
            a.add(true);
        }
        return a;
        
    }
}