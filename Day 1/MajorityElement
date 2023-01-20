class MajorityElement {
    public int majorityElement(int[] nums) {
        int max=0;
        int ele=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j])
                c++;
            }
            if(c>max){
                max=c;
                ele=nums[i];
            }
        }
        if(max>=Math.ceil(n/2))
        return ele;
        return -1;
    }
}
