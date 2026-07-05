class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        Map<String, List<String>> anagramMap = new HashMap();

        

        for(String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!anagramMap.containsKey(key)) {
                List<String> stringList = new LinkedList();
                stringList.add(s);
                anagramMap.put(key, stringList);
            } else {
                List<String> stringList = anagramMap.get(String.valueOf(chars));
                stringList.add(s);
                anagramMap.put(key, stringList);
            }
        }

        List<List<String>> result = new ArrayList();

        for(String key: anagramMap.keySet()) {
            result.add(anagramMap.get(key));
            System.out.println(key);
        }
        System.out.println(result);

        return result;

    }
}
