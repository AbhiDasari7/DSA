class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> a = new ArrayList<>();
        for(int i =0;i<nums1.length;i++)
        {
            for(int j =0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]&&!(a.contains(nums1[i])))
                a.add(nums1[i]);
            }
        }
        for(int i =0;i<nums1.length;i++)
        {
            for(int j = 0;j<nums3.length;j++)
            {
                if(nums1[i]==nums3[j]&&!(a.contains(nums1[i])))
                a.add(nums1[i]);
            }
        }
        for(int i =0;i<nums2.length;i++)
        {
            for(int j =0;j<nums3.length;j++)
            {
                if(nums2[i]==nums3[j]&&!(a.contains(nums2[i])))
                a.add(nums2[i]);
            }
        }
        return a;
    }
}