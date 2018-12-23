import java.util.Scanner;

public class Solution {

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