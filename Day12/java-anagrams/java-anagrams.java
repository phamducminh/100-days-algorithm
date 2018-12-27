import java.util.Scanner;

public class Solution {

    // Runtime: 40 ms, faster than 9.78% of Java online submissions for Valid Anagram.
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int aLength = a.length();
        int bLength = b.length();

        if (aLength != bLength) {
            return false;
        }

        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < aLength; i++) {
            Character c = Character.toLowerCase(a.charAt(i));
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer value = map.get(c);
                map.put(c, ++value);
            }
        }

        for (int i = 0; i < bLength; i++) {
            Character c = Character.toLowerCase(b.charAt(i));
            if (!map.containsKey(c)) {
                return false;
            } else {
                Integer value = map.get(c);
                if (value - 1 < 0) {
                    return false;
                } else {
                    map.put(c, --value);
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

// Runtime: 7 ms, faster than 42.42% of Java online submissions for Valid Anagram.
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength) {
            return false;
        }
        
        int[] sArr = new int[26];

        for (int i = 0; i < sLength; i++) {
            sArr[(int) Character.toLowerCase(s.charAt(i)) - 97]++;
        }
        
        for (int i = 0; i < tLength; i++) {
            int index = (int) Character.toLowerCase(t.charAt(i)) - 97;
            if (sArr[index] == 0) {
                return false;
            }
            sArr[index]--;
            if (sArr[index] < 0) {
                return false;
            }
        }
        
        return true;
    }
}

// Runtime: 3 ms, faster than 89.37% of Java online submissions for Valid Anagram.
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength) {
            return false;
        }
        
        int[] sArr = new int[26];

        for (int i = 0; i < sLength; i++) {
            sArr[(int) s.charAt(i) - 97]++;
            sArr[(int) t.charAt(i) - 97]--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (sArr[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}