class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s: strs){

            int[] count = new int[26];

            for(char c: s.toCharArray()){
                count[c-'a']++;
            }

            String hashKey = Arrays.toString(count);
            hm.putIfAbsent(hashKey, new ArrayList<>());
            hm.get(hashKey).add(s);
        }
       
return new ArrayList<>(hm.values());

    }



  

    
}
