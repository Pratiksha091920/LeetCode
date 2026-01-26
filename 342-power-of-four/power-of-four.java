class Solution {
    public boolean isPowerOfFour(int n) {
        // for(int i=0;i<16;i++){
        //     int powerofFour=(int) Math.pow(4,i);
        //     if(powerofFour==n){
        //     return true;
        // }
        // if(powerofFour>n){
        //     return false;
        // }
        // }
        

        // return false;
      
        // If 'n' is 1, it is a power of four
        if (n == 1)
            return true;
        
        // If 'n' is non-positive, it cannot be a power of four
        if (n <= 0)
            return false; 
        
        // Calculate the logarithm of 'n' with base 4
        double ans = Math.log(n) / Math.log(4);
        
        // Check if the result of the logarithmic operation is an integer
        return (ans==(int)ans);
    

    }
}