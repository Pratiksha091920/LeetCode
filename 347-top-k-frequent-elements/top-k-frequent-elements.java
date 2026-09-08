class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // HashMap<Integer,Integer> map=new HashMap<>();

        // int[] result=new int[k];

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // for(int i=0;i<k;i++){
        //     int maxnum=0;
        //     int maxfreq=0;

        //     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //         if(entry.getValue()> maxfreq){
        //             maxfreq=entry.getValue();
        //             maxnum=entry.getKey();
        //         }

        //     }

        //     result[i]=maxnum;
        //     map.remove(maxnum);
        // }

        // return result;

        HashMap<Integer,Integer> map=new HashMap<>();
        

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer>[] bucket=new ArrayList[nums.length+1];
       
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();

            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }

            bucket[freq].add(num);
         }
        int index=0;
        int result[]=new int[k];
         for(int freq=bucket.length-1;freq>=0 && index< k;freq--){
            if(bucket[freq]!=null){
                for(int num:bucket[freq]){
                    result[index]=num;
                    index++;

                    if(index==k){
                        break;
                    }
                }
            }
         }
       return result;
        
    }
}