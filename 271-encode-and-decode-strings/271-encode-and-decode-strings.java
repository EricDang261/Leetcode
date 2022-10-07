public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();
        for(String str : strs){
            strBuilder.append(str.length()).append("#").append(str);
        }
        return strBuilder.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0 ;
        while( i < s.length()){
            int j = i;
            while(s.charAt(j) != '#') j++; // move j until the next delimeter character
            int strLength = Integer.valueOf(s.substring(i, j));
            // reset i
            i = j + 1 + strLength;
            res.add(s.substring(j+1, i));
        }
        return res;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));