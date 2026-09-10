class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int longest=0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
               int currentnum=num;
               int length=1;

               while(set.contains(currentnum+1)){
                currentnum++;
                length++;
               }

               longest=Math.max(length,longest);
            }
        }
        return longest;
        
    }
}