class multiplyStrings {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int carry=0;
        int pos=0;
        int m;
        int a[]= new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
        for(int j=n2-1;j>=0;j--){
            m=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            
            //int sum=m+carry;
            a[i+j+1]+=m;
           // carry=sum/10;
        }
        }
     for (int i = a.length - 1; i >= 0; i--) {
            int tmp = (a[i] + carry) % 10;
            carry = (a[i] + carry) / 10;
            a[i] = tmp;
        }

       StringBuilder sb=new StringBuilder();
        for (int n : a) sb.append(n);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
