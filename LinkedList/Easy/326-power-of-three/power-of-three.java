class Solution {
    public boolean isPowerOfThree(int n) {
        boolean b= false;
        if(n==0){
            return b;
        }
        else if(n==1){
            b=true;
        }
        else{
            return (n%3==0 && isPowerOfThree(n/3));
        }
        return b;
    }
}