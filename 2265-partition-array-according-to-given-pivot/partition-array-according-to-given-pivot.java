class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int a[] = new int[nums.length];
        List<Integer> b = new ArrayList<>();
        int i = 0 , j = 0 ,  c = 0;
        for(int k = 0;k<nums.length;k++)
        {
            if(nums[k]<pivot)
            {
                a[i] = nums[k];
                i++;
            }
            else if(nums[k]==pivot)
            c++;
            else
            b.add(nums[k]);

        }
        for(int m = 0;m<c;m++)
        {
            a[i] = pivot;
            i++;
        }
        for(int m = 0;m<b.size();m++)
        {
            a[i] = b.get(m);
            i++;
        }
        return a;

        
    

        
        
    }
}