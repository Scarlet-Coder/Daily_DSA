class divideTwoInteger {
    public int divide(int dividend, int divisor) {
        int sign=1;
        int q=dividend/divisor;

        if(q>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(q<=Integer.MIN_VALUE && divisor<=0)
            return Integer.MAX_VALUE;
        else if(q<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return q;
    }
}
