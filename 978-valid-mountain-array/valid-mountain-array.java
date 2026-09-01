class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length == 1||arr.length==2)
        return false;
        boolean b = true;
        int i =0;
        int k=0;
        if(arr[0]>arr[1])
        return false;
        while(b&&i<arr.length-1)
        {
            if(arr[i]<arr[i+1]){
            i++;
            k++;
            }
            
            else
            {
                b = false;
            }
        }
        if(k==arr.length-1)
        return false;
        boolean c = true;
        while(c&&i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
            i++;
            else{
            return false;

            }
        }
        return true;

        
    }
}