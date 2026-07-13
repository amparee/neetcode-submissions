class TimeMap {

    Map<String, List<Pair>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair pair = new Pair(value, timestamp);
        map.putIfAbsent(key, new ArrayList());
        map.get(key).add(pair);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<Pair> res = map.get(key);
        int l = 0;
        int r = res.size() - 1;
        int ans = -1;
        int mid = 0;

        while (l <= r) {
            mid = l + (r-l) /2;
            Pair p = res.get(mid);
            if(p.getTimestamp() <= timestamp) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1 ;
            }
        }
        return ans == -1 ? "" : res.get(ans).getValue();
        
    }

    class Pair {
        private String value;
        private Integer timestamp;

        public Pair(String value, Integer timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

        public String getValue() {
            return this.value;
        }
        
        public Integer getTimestamp() {
            return this.timestamp;
        }
    }
}
