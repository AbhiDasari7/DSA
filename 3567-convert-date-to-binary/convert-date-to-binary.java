class Solution {
    public String convertDateToBinary(String date) {
        int a = Integer.parseInt(date.substring(0,4));
        int b = Integer.parseInt(date.substring(5,7));
        int c = Integer.parseInt(date.substring(8));
        String r = Integer.toBinaryString(a)+"-"+Integer.toBinaryString(b)+"-"+Integer.toBinaryString(c);
        return r;
        
    }
}