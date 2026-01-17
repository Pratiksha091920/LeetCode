class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String doubled=s+s;
        int n=doubled.length();

        String trimmed=doubled.substring(1,n-1);

        boolean result=trimmed.contains(s);

        return result;
        
    }
}