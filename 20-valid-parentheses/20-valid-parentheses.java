class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else
            {
                if(st.empty()) return false; // ]( 
                if( c == ')' && st.peek() != '(') return false;
                else if( c == '}' && st.peek() != '{') return false;
                else if( c == ']' && st.peek() != '[') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}