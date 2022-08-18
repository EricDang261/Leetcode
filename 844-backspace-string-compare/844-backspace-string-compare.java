class Solution {
    // stack
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    
    public String build(String str){
        char[] charArray = str.toCharArray(); // convert into charArray
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(charArray[i] == '#'  && !st.empty()){
                st.pop();
            }else if (charArray[i] != '#'){
                st.push(charArray[i]);
            }
        }
        return String.valueOf(st);
    }
}