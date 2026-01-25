class Solution {
    public int[] singleNumber(int[] nums) {
         int unique = 0;
        for (int num : nums) {
            unique ^= num;  
        }

       
        int rightmostSetBit = unique & -unique;

        int num1 = 0, num2 = 0;

        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 =num1^num;  
            } else {
                num2=num2^ num; 
            }
        }

        return new int[]{num1, num2};
    }

       
    }
