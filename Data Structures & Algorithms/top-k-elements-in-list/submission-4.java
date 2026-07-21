class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();

        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] kFreqs = new List[nums.length + 1];

        for (int key : freqs.keySet()) {
            List<Integer> currList = kFreqs[freqs.get(key)];

            if (currList == null) {
                currList = new ArrayList();
            }
            currList.add(key);
            kFreqs[freqs.get(key)] = currList;
        }

        System.out.println(Arrays.toString(kFreqs));

        int[] result = new int[k];
        int idx = 0;

        for (int i = kFreqs.length - 1; 0 < i; i--) {
            List<Integer> bucket = kFreqs[i];
            if(bucket == null) continue;
            for (int n : bucket) {
                result[idx] = n;
                idx++;
                if (idx == k) return result;
            }
        }

        return result;
    }
}
