class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char a[] = address.toCharArray();
        for(int i =0;i<a.length;i++)
        {
            if(a[i]=='.')
            {
                sb.append("[.]");
            }
            else
            sb.append(a[i]);
        }
        return sb.toString();
        
    }
}