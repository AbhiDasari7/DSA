class Solution {
    public int maxDistinct(String s) {
        HashMap<Character , Integer> a = new HashMap<>();
        for(char ch : s.toCharArray()){
            a.put(ch,1);
        }
        return a.size();

        
        
    }
}