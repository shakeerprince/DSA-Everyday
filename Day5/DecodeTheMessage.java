class Solution {
    public String decodeMessage(String key, String message) {
        int temp =  97;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i<key.length(); i++){
            char ch = key.charAt(i);
            if(ch!=' ' && !map.containsKey(ch)){
                map.put(ch, (char)temp);
                temp++;
            }
        }
            String ans = "";
        for(int i = 0; i< message.length(); i++){
            char ch = message.charAt(i);
            if(ch! =' '){
                char val = map.get(ch);
                ans += val;
            }else{
                ans+=' ';
            }
        }

        return ans;
    }
}
