//
class Solution {
    public int firstUniqChar(String s) {
//         Map<Character, Integer> hashMap = new HashMap<>();
//         int result = -1;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (!hashMap.containsKey(c)) {
//                 hashMap.put(c, 0);
//             } else {
//                 hashMap.put(c, hashMap.get(c) + 1);
//             }
//         }

//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (hashMap.get(c) == 0) {
//                 result = i;
//                 break;
//             }
//         }

//         return result;
        // Array to store the first occurrence index of each character
        int[] freq = new int[26];

        // Initialize with -1
        Arrays.fill(freq, -1);

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            // If the character is seen for the first time,
            // store its index
            if (freq[cur - 'a'] == -1) {
                freq[cur - 'a'] = i;
            }
            else {

                // If the character is seen again, mark it
                // as -2
                freq[cur - 'a'] = -2;
            }
        }

        // Initialize idx to maximum integer value
        int idx = Integer.MAX_VALUE;

        // Find the smallest index which is not marked as -1
        // or -2
        for (int i = 0; i < 26; i++) {
            if (freq[i] >= 0) {
                idx = Math.min(idx, freq[i]);
            }
        }

        // If no non-repeating character is found, return -1
        return (idx == Integer.MAX_VALUE) ? -1 : idx;
    }
}