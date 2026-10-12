class Solution {
    public static boolean isPalindrome(String s) {

        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        String str=sb.toString();
        String sbstr=sb.reverse().toString();

        return str.equals(sbstr);
   
    }


}