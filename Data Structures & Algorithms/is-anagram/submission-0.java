class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char l:  s.toCharArray()) {
            if (!hm.containsKey(l)) {
                hm.put(l, 1);
            }
            else {
                hm.put(l, hm.get(l) + 1);
            }
        }

        for (char letter:  t.toCharArray()) {
            if (!hm.containsKey(letter)) {
                return false;
            }
            else {
                hm.put(letter, hm.get(letter) -1 );
            }
        }

        for (Map.Entry m:hm.entrySet()) {
            if ((Integer)m.getValue() == 0) {
            }
            else {
                return false;
            }
        }


        return true;
    }
}
