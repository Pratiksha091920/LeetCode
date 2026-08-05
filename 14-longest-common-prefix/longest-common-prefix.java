class Solution {
    public String longestCommonPrefix(String[] strs) {
     
    int n = strs.length;
    Arrays.sort(strs);
    StringBuilder result=new StringBuilder();

    char[] first=strs[0].toCharArray();
    char[] last=strs[n-1].toCharArray();

     for(int i=0;i<first.length;i++){
        if(first[i]!=last[i]){
            break;
        }
        result.append(first[i]);
     }

     return result.toString();
    }
}