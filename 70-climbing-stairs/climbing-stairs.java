class Solution {
    public int climbStairs(int n) {

       if(n<=2){
        return n;
       }
       int a=2;  //2steps 1st way
       int b=1; //1 step 2nd way
       for(int i=3;i<=n;i++){
          int c=a+b;
         b=a;
         a=c;

       }
       return a;

    }
}