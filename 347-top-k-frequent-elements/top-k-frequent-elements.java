class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        int[] result=new int[k];

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<k;i++){
            int maxnum=0;
            int maxfreq=0;

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()> maxfreq){
                    maxfreq=entry.getValue();
                    maxnum=entry.getKey();
                }

            }

            result[i]=maxnum;
            map.remove(maxnum);
        }

        return result;
        
    }
}