class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);           // move 1 step
            fast = getNext(getNext(fast)); // move 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    private int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
