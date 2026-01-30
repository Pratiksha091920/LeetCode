class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;

        // Move all non-zero numbers to the front
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining places with 0
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
    }
}
