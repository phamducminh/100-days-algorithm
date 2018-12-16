// Runtime: 18 ms, faster than 14.31% of Java online submissions for Jewels and Stones.
class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        
        for (int j = 0; j < S.length(); j++) {
            if (set.contains(S.charAt(j))) {
                result++;
            }
        }
        
        return result;
    }
}

// Runtime: 8 ms, faster than 92.58% of Java online submissions for Jewels and Stones.
class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        
        for (int j = 0; j < S.length(); j++) {
            if (J.contains(String.valueOf(S.charAt(j)))) {
                result++;
            }
        }
        
        return result;
    }
}

// Runtime: 8 ms, faster than 92.58% of Java online submissions for Jewels and Stones.
class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        
        for (int j = 0; j < S.length(); j++) {
            if (J.indexOf(S.charAt(j)) != -1) {
                result++;
            }
        }
        
        return result;
    }
}