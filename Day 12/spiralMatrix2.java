class spiralMatrix2 {
    public int[][] generateMatrix(int n) {
       int arr[][]=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int c=1;
        while(true){
        for(int i=left;i<=right;i++)
            arr[top][i]=c++;
        top++;
            if(left>right|| top>bottom)
                break;
        for(int i=top;i<=bottom;i++)
            arr[i][right]=c++;
        right--;
              if(left>right|| top>bottom)
                break;
        for(int i=right;i>=left;i--)
            arr[bottom][i]=c++;
        bottom--;
          if(left>right|| top>bottom)
                break;
        for(int i=bottom;i>=top;i--)
            arr[i][left]=c++;
        left++;
          if(left>right|| top>bottom)
                break;
            
        }
        return arr;
    }
}
