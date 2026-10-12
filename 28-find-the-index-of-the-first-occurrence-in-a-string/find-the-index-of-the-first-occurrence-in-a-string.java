class Solution {
    public int strStr(String haystack, String needle) {

        int n=haystack.length();
        int m=needle.length();

        if(needle.isEmpty()){
            return 0;
        }

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
       
        
    }
}