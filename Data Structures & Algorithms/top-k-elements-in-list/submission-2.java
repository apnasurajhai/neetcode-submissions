class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
      
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        List<int[]>list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            list.add(new int[]{entry.getKey(), entry.getValue()});
        };

        list.sort((a,b)-> b[1]-a[1]);

        int []ans  = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i)[0];
        }


        return ans;



        
    }
}
