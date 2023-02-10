class moveZeros {
    public void moveZeroes(int[] nums) {
           int noOfZeros = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                noOfZeros++; 
            }
            else if (noOfZeros > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-noOfZeros]=t;
            }
        }
    }
}
