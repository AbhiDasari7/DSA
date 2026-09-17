class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a = coordinates.charAt(0);
        int b= Integer.parseInt(coordinates.substring(1));
        if(((a=='a'||a=='c'||a=='e'||a=='g')&&b%2!=0)||((a=='b'||a=='d'||a=='f'||a=='h')&&b%2==0))
        return false;
        return true;
        
            
        
    }
}