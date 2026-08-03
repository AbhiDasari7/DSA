class Solution {
    public int mostWordsFound(String[] sentences) {
        int m =0;
        for(int i=0;i<sentences.length;i++)
        {
            String a[] = sentences[i].split(" ");
            if(m<a.length)
            m = a.length;
        }
        return m;
        
    }
}