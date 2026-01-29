class Solution {
    public int minOperations(int[] nums, int k) {

       int sum=0;
       int remainder=0;
      

      for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
      }
        if(sum%k==0){
           return 0;
        }
        else{
            remainder=sum%k;
        }
        return remainder;
        
       


        
    }
}