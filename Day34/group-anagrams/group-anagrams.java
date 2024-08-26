// https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/778/
class Solution {
    public String sortString(String input) {
        // Converting input t character Array
        char temp[] = input.toCharArray();
        
        // Sorting temp array
        Arrays.sort(temp);
        
        // Returning new sorted string
        return new String(temp);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            String sortedStr = sortString(strs[i]);
            
            if (hashMap.containsKey(sortedStr)) {
                List<String> list1 = hashMap.get(sortedStr);
                list1.add(strs[i]);
            } else {
                List<String> list2 = new ArrayList<>();
                list2.add(strs[i]);
                hashMap.put(sortedStr, list2);
            }
        }
        
        for (List<String> value : hashMap.values()) {
            result.add(value);
        }
        
        return result;
    }
}