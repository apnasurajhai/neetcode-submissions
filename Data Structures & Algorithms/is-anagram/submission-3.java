class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for(char c: s.toCharArray()){
            first.put(c, first.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            second.put(c, second.getOrDefault(c,0)+1);
            if(!first.containsKey(c)){
                return false;
            }
        }

        for(char c: s.toCharArray()){
            if(first.containsKey(c) && second.containsKey(c)){
                if(first.get(c).equals(second.get(c))){
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;

    }
}
