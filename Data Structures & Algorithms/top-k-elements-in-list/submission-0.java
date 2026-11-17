class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        List<Integer>[] buckets = new ArrayList[nums.length + 1];  
        Map<Integer, Integer> freq = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : freq.entrySet()) {
            int num = m.getKey();
            int count = m.getValue();  

            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(num);
        }
        
        int i = 0;

        for (int j = buckets.length - 1; j >= 0 && i < k; j--) {
            if (buckets[j] != null) {
                for (int num : buckets[j]) {
                    ans[i++] = num;
                    if (i == k) break;
                }
            }
        }
        
        return ans;
    }
}
