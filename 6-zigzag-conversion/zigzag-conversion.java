class Solution {
    public String convert(String s, int num) {
        
        if(s.length()<=num || num==1){
            return s;
        }
        StringBuilder res[]=new StringBuilder[num];
        for(int i=0;i<num;i++){
            res[i]=new StringBuilder();
        }
        int in=0,st=1;
        for(char c: s.toCharArray()){
            res[in].append(c);
            if(in==0){
                st=1;
            }else if(in == num-1){
                st=-1;
            }
            in+=st;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder sb: res){
            result.append(sb);
        }
        return result.toString();
    }
}