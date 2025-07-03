class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, ans = 0;

        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);
            if (map.containsKey(currentChar)) {
                l = Math.max(map.get(currentChar) + 1, l); 
            }

            map.put(currentChar, r); 
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
