class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freqs_ordered = (List<Integer>[])new ArrayList[nums.length+1];
        Map<Integer, Integer> freqs_map = new HashMap<>();
        int[] result = new int[k];

        for(int n : nums) {
            freqs_map.put(n, freqs_map.getOrDefault(n, 0) + 1);
        }

        for(Integer key : freqs_map.keySet()) {
            int num = freqs_map.get(key);
            if(freqs_ordered[num] == null) 
                freqs_ordered[num] = new ArrayList<>();
            freqs_ordered[num].add(key);
        }


        int i = 0;
        while(i < k) {
            for (int j = freqs_ordered.length - 1; 0 <= j; j-- ) {
                if(freqs_ordered[j] != null && !freqs_ordered[j].isEmpty() ) {
                    result[i] = freqs_ordered[j].get(0);
                    freqs_ordered[j].remove(0);
                    i++;
                    break;
                }
            }
        }

        return result;
    }
}
