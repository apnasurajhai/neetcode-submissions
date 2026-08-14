class Solution {

    public String encode(List<String> strs) {
        String encoded_string="";

        for(String str:strs){
            encoded_string+=str.length()+"#"+str;
        }

        return encoded_string;


    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }

            int lengthOfString = Integer.parseInt(str.substring(i,j));

            i=j+1;
            j=i+lengthOfString;
            ans.add(str.substring(i,j));
            i=j;
            

        }
        return ans;

    }
}
