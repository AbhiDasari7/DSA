class Solution {
    public int elevatorRequests(int n, int[] requests) {
    int c  = requests[0];
    for(int i = 0;i<requests.length-1;i++)
    {
        c = c+Math.abs(requests[i]-requests[i+1]);
    }
    return c;
        
    }
}