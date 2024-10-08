class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                st.push(c);
            } else {
                if (st.empty()) {
                    count++;
                } else {
                    st.pop();
                }
            }
        }

        int ans = count / 2;
        if (count % 2 != 0) {
            ans++;
        }
        return ans;
    }
}