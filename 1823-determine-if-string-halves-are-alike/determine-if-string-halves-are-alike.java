class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);

       for (int i = 0; i < s1.length(); i++) {
    char ch = s1.charAt(i);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        count1++;
    }
}
        for (int i = 0; i < s2.length(); i++) {
    char ch = s2.charAt(i);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        count2++;
    }
}

        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
        
    }
}