class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min =nums[0] , max=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]<min)
            min = nums[i];
            if(nums[i]>max)
            max = nums[i];
        }
        List<Integer> a = new ArrayList<>();
        int c=0;
        for(int i =min;i<=max;i++){
            c=0;
        for(int j=0;j<nums.length;j++){
        if(i==nums[j])
        c++;
        }
        if(c!=1)
        a.add(i);
        }
        return a;
    }
}