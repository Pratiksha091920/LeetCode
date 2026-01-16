class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();

        if(strs==null ||strs.length==0){
            return new ArrayList<>();
        }

        for(String words:strs){
            char ch[]=words.toCharArray();
             Arrays.sort(ch);
            String Sortedword=new String(ch);

            map.putIfAbsent(Sortedword,new ArrayList<>());
            map.get(Sortedword).add(words);

           
        }

        return new ArrayList<>(map.values());
       
        
    }
}