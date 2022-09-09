class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                st.push(st.pop() + st.pop());
            }else if(token.equals("-")){
                int a = st.pop(); // second element
                int b = st.pop(); // the first element
                st.push(b-a); 
            }else if(token.equals("*")){
                st.push(st.pop() * st.pop());
            }else if(token.equals("/")){
                int a = st.pop(); // second element
                int b = st.pop(); // the first element
                st.push(b/a); 
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}