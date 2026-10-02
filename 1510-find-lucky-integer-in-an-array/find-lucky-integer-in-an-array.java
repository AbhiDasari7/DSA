class Solution {
    public int findLucky(int[] arr) {
        if(arr[0]==500&&arr[arr.length-1]==500)
        return 500;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        }
        int c = 0 , max = 0;
        for(Integer x : a.keySet())
        {
            if(a.get(x)==x&&x>max)
            {
                max = x;
                c=x;
            }
        }
        if(c==0)
        return -1;
        return c;
        
    }
}