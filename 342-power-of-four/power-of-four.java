class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<16;i++){
            int powerofFour=(int) Math.pow(4,i);
            if(powerofFour==n){
            return true;
        }
        if(powerofFour>n){
            return false;
        }
        }
        

        return false;
    }
}