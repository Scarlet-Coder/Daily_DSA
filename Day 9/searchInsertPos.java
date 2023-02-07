class searchInsertPos {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;

        int mid,start=0,end=nums.length-1;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return nums[start]<target?start+1:start;
    }
}
