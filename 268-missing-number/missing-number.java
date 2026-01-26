class Solution {
    public int missingNumber(int[] nums) {

        // int i=0;
        // int N=nums.length;
        // while(i<N){
        //     int correctIndex=nums[i];
        //     if(nums[i]<nums.length && nums[i]!=nums[correctIndex]){
        //         int temp=nums[i];
        //         nums[i]=nums[correctIndex];
        //         nums[correctIndex]=temp;
        //     }
        //     else{
        //         i++;
        //     }
        // }

        // for(int index=0;index<nums.length;index++){
        //     if(nums[index]!=index){
        //         return index;
        //     }
        // }
        // return nums.length;
        
        int xor=0;
        for(int i=0;i<=nums.length;i++){
        xor=xor^i;
        }
        for(int n:nums){
        xor=xor^n;
        }
        

        return xor;
    }
}