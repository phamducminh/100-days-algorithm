// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        if (sLength != tLength)
            return false;
        
        String newS = sortString(s);
        String newT = sortString(t);
        
        return newS.equals(newT);
    }
    
    public String sortString(String input) {
        // Converting input t character Array
        char temp[] = input.toCharArray();
        
        // Sorting temp array
        Arrays.sort(temp);
        
        // Returning new sorted string
        return new String(temp);
    }
}