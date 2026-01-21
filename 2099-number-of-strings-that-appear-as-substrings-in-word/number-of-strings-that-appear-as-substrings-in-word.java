class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int count=0;

        int m=patterns.length;
        int n=word.length();

        for(String pattern:patterns){

            if(word.contains(pattern)){
                count++;
            }

        }
        return count;

    }
}