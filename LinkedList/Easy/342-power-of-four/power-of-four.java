class Solution {
    public boolean isPowerOfFour(int n) {
         boolean b= false;
        if(n==0){
            return b;
        }
        else if(n==1){
            b=true;
        }
        else{
            return (n%4==0 && isPowerOfFour(n/4));
        }
        return b; 
    }
}