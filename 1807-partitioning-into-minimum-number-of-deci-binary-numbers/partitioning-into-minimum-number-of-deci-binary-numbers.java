class Solution {
    public int minPartitions(String n) {
        char a[] = n.toCharArray();
        char max = '0';
        for(int i =0;i<a.length;i++)
        {
            if(a[i]=='9')
            return 9;
            if(a[i]>max)
            max = a[i];
        }
        return max-'0';
    }
}