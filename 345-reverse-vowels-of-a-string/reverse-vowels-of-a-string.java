class Solution {
    public String reverseVowels(String s) {
        String vowelsStr = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>();

        
        for (char c : arr) {
            if (vowelsStr.indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (vowelsStr.indexOf(arr[i]) != -1) {
                arr[i] = vowels.remove(vowels.size() - 1); 
            }
        }

        return new String(arr);
    }
}
