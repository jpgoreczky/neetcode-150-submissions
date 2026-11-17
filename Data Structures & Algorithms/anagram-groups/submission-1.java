class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        
        for (String s : strs) {
            int[] freq = new int[26];
            for (char l : s.toCharArray()) {
                freq[l - 'a']++;
            }
            String key = Arrays.toString(freq);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(s);
        }


        
        return new ArrayList<>(hm.values());
    }
}
