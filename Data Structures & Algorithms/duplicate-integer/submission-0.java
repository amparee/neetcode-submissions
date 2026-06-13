class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        for (Integer number: nums) {
            if(map.containsKey(number)) {
                map.put(number, map.get(number)+1);
            } else {
                map.put(number, 1);
            }
        }

        for(Integer k: map.keySet()) {
            
            if(map.get(k) > 1)
                return true;
        }

        return false;
    }
}