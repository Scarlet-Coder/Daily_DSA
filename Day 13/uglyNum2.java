class uglyNum2 {
    public int nthUglyNumber(int n) {
      TreeSet<Long>  ts=new TreeSet<>();
        ts.add(1l);
        for(int i=0;i<n-1;i++){
            long first=ts.pollFirst();
            ts.add(first*2);
            ts.add(first*3);            
            ts.add(first*5);

        }
        return ts.pollFirst().intValue();
        
    }
}
