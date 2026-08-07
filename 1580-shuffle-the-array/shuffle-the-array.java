class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[2*n];
        for(int i =0;i<n;i++)
        a[i]=nums[i];
        for(int j=0,i=n;j<n;j++,i++)
        b[j]=nums[i];
        for(int i =0,j=0;i<2*n&&j<n;i+=2,j++){
        c[i]=a[j];
        c[i+1]=b[j];
        }
        return c;

        

    }
}