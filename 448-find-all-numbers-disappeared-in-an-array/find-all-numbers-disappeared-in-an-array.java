class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                //swap
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();

        for(int index=0;index<n;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);

            }
        }
        return ans;
        
    }
}