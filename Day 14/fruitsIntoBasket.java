class fruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        int c=0, i; 
        for( i=0;i<fruits.length;i++){
           
                map1.put(fruits[i],map1.getOrDefault(fruits[i],0)+1);
                if (map1.size() > 2) {
                map1.put(fruits[c], map1.get(fruits[c]) - 1);
                map1.remove(fruits[c++], 0);
            }
        }
        return i - c;

        
    }
}
