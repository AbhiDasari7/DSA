class Solution {
    public int scoreOfString(String s) {
        char a[] = s.toCharArray();
        int k =0;
        for(int i =0;i<a.length-1;i++)
        {
            k = k+Math.abs((int)a[i]-(int)a[i+1]);
        }
        return k;
        
    }
}