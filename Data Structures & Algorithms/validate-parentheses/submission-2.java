class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            } else{
                if(c=='}' && !st.isEmpty() && st.peek().equals('{')){
                    st.pop();
                }else if(c==']' && !st.isEmpty() && st.peek().equals('[')){
                    st.pop();
                }else if(c==')' && !st.isEmpty() && st.peek().equals('(')){
                    st.pop();
                }else {
                    return false;
                }
            }
        }

        return st.isEmpty();
        
    }
}
