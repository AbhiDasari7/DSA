class Solution {
    public int[] findDegrees(int[][] matrix) {
        int c=0;
        int a[] = new int[matrix.length];
        for(int i =0;i<matrix.length;i++)
        {
            c=0;
            for(int j =0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==1)
                c++;
            }
            a[i]=c;

        }
        return a;
    }
}