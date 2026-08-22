class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int h = 0;
        int n = arr.length;
        for(int i = 0;i<n-2;i++)
        {
            for(int j = i+1;j<n-1;j++)
            {
                for(int k = j+1;k<n;k++)
                {
                    int a1 = arr[i]-arr[j]>0?arr[i]-arr[j]:arr[j]-arr[i];
                    int b1 = arr[j]-arr[k]>0?arr[j]-arr[k]:arr[k]-arr[j];
                    int c1 = arr[i]-arr[k]>0?arr[i]-arr[k]:arr[k]-arr[i];
                    if(a1<=a&&b1<=b&&c1<=c)
                    h++;
                }
            }
        }
        return h;
        
    }
}