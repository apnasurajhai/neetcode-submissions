class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s:strs){
            String sortedString = sortString(s);
            List<String> strList = hm.getOrDefault(sortedString,new ArrayList<>());
            strList.add(s);
            hm.put(sortedString,strList);
        }

        for (List<String> list : hm.values()) {
    ans.add(list);
}

return ans;

    }



    public static String sortString(String s) {
       
        
        // 1. Convert string to a character array
        char[] chars = s.toCharArray();
        
        // 2. Sort the array alphabetically (ASCII order)
        Arrays.sort(chars);
        
        // 3. Convert the sorted array back into a String
        return  new String(chars);
        
        
    }

    
}
