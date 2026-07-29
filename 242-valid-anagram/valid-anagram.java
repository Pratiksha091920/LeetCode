class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();

        // if(m!=n){
        //     return false;
        // }

        // int count[]=new int[26];

        // for(int i=0;i<m;i++){
        //     count[s.charAt(i)-'a']++;
        //     count[t.charAt(i)-'a']--;
        // }

        // for(int c:count){
        //     if(c!=0){
        //         return false;
        //     }
        // }
        // return true;

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)){
               return false;
            }

            map.put(ch,map.get(ch)-1);

            if(map.get(ch)==0){
                map.remove(ch);
            }

        }
    
    return map.isEmpty();
        
    }
}