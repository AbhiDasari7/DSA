class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        char a[] = s.toCharArray();
        for(int  j =0;j<a.length;j++)
        {
            if(i<spaces.length&&j==spaces[i])
            {
                sb.append(" ");
                i++;
            }
            sb.append(a[j]);

        }
        return sb.toString();
        
    }
}