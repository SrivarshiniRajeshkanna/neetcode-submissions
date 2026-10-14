class Solution {

    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for(String str : strs){
            st.append(str.length()).append("#").append(str);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0; 
        while(i<str.length()){
            int j =i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j = len + i;
            result.add(str.substring(i,j));
            i = j;
        }
        return result;
    }
}
