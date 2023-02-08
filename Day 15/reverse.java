import java.util.StringTokenizer;
class reverse {
    public String reverseWords(String s) {
        String ans="";
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            str=rev(str);
            ans+=str+" ";
            
        }
       ans= ans.trim();
        return ans;
        
    }
    public String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
