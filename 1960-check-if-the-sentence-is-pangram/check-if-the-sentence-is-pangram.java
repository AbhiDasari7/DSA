class Solution {
    public boolean checkIfPangram(String sentence) {
        List <Character> a = new ArrayList<>();
        for(int i =0;i<sentence.length();i++)
        a.add(sentence.charAt(i));
        for(int i=1;i<=26;i++)
        {
            if(!(a.contains((char)(i+96))))
            return false;
        }
        return true;
        
    }
}