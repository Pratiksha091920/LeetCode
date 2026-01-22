class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i:nums) {
            int digits = String.valueOf(i).length();
            // int digits = Integer.toString(i).length();

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}