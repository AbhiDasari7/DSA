class Solution {
    public int[] scoreValidator(String[] events) {
        int a[] = new int[2];
        int r = 0 , c=0;
        for(int i =0;i<events.length;i++)
        {
            if(events[i].equals("W"))
            c++;
            else if(events[i].equals("WD")||events[i].equals("NB")){
            if(c<10)
            r=r+1;
        }
            else
            {
                if(c<10){
                int m = Integer.parseInt(events[i]);
            
                r=r+m;
                }
            }
        }
        a[0] = r;
        a[1]=c>10?10:c;
        return a;
        
    }
}