class uniqueNoOcc {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    c++;
            }
            //System.out.println(c);
            if(hs.containsKey(c)&& !hs.containsValue(arr[i]))
                return false;
            else
                hs.put(c,arr[i]);
            c=0;
        }
        return true;
    }
}
