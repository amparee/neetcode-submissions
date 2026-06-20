class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap();

        for (int n : nums ) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a)); 

        for(int n : freq.keySet()) {
            maxHeap.add(n);
        }

        int[] aux = new int[k];
        while (0 < k) {
            aux[k-1] = maxHeap.poll();
            k--;
        }

        return aux;
    }
}
