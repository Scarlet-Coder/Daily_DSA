class powerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
 
        while(true){
            if(n%2==0){
                n/=2;
            }
            else 
                break;
        }
        if(n==1)
            return true;
        return false;
    }
}
