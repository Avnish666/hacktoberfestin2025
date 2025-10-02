class Solution {
    public boolean backspaceCompare(String s, String t) {
        String rs="",rt="";
        for(int i=0;i<s.length();i++){
            if(rs.length()!=0&&s.charAt(i)=='#')
            rs=rs.substring(0,rs.length()-1);
            if(s.charAt(i)!='#')
            rs=rs+s.charAt(i);
            
        }
       for(int j=0;j<t.length();j++){
            if(rt.length()!=0&&t.charAt(j)=='#'){
            rt=rt.substring(0,rt.length()-1);
             }
            if(t.charAt(j)!='#')
            rt=rt+t.charAt(j);
             
        }
       
        return rs.equalsIgnoreCase(rt);
    }
}
