class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int res[] = new int[len];
        Stack<int[]> st = new Stack<>();

        for(int i=0;i<len;i++){
            int currTemp = temperatures[i];
            while(!st.isEmpty() && currTemp > st.peek()[0]){
                int pair[] = st.pop();
                res[pair[1]] = i-pair[1];
            }
            st.push(new int[]{currTemp, i});
        }
        return res;
    }
}
