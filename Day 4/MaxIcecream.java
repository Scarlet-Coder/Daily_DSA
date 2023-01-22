class MaxIcecream {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
        int n=costs.length;
        int c=0;
        while(c<n && costs[c]<=coins){
            coins=coins - costs[c];
            c++;
        }
        return c;
    }
}
