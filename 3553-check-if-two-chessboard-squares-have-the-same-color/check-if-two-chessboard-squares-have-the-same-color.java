class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a1 = coordinate1.charAt(0);
        char a2 = coordinate2.charAt(0);
        int n1 = coordinate1.charAt(1)-'0';
        int n2 = coordinate2.charAt(1)-'0';
        int n = n1+n2;
        int c1 = 0,c2=0;
        if(((a1=='a'||a1=='c'||a1=='e'||a1=='g')&&(n1%2!=0))||((a1=='b'||a1=='d'||a1=='f'||a1=='h')&&(n1%2==0)))
        c1++;
        if(((a2=='a'||a2=='c'||a2=='e'||a2=='g')&&(n2%2!=0))||((a2=='b'||a2=='d'||a2=='f'||
        a2=='h')&&(n2%2==0)))
        c2++;
        if(c1==c2)
        return true;
        return false;

    }
}