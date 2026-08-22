class Solution {
    public void duplicateZeros(int[] arr) {
        int a[] = new int[arr.length];
        int i = 0 , j = 0;
        while(j<a.length)
        {
            if(arr[i]!=0)
            {
                a[j]=arr[i];
                i++;
                j++;
            }
            else
            {
                a[j] = 0;
                if(j+1<a.length)
                a[j+1]=0;
                i++;
                j+=2;
            }
        }
        for(int k =0;k<a.length;k++)
        arr[k] = a[k];
        
        
    
        
    }
}