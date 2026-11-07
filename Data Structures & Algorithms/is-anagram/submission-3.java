class Solution {
    public boolean isAnagram(String s, String t) {
        //HashMap<Character,Integer> mapS = new HashMap<>();
        //HashMap<Character,Integer> mapT = new HashMap<>();

        //for(char c : s.toCharArray()){
            //int value = mapS.get(c) != null ? (mapS.get(c) + 1) : 1;
        //    mapS.put(c,(mapS.getOrDefault(c,0) + 1));
        //}

        //for(char c : t.toCharArray()){
           //int value = mapT.get(c) != null ? (mapT.get(c) + 1) : 1;
        //    mapT.put(c,(mapT.getOrDefault(c,0) + 1));
        //}
        
        //return mapS.equals(mapT);

        int[] arr = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length() ; i++){
            arr[(s.charAt(i) - 'a')]++;
            arr[(t.charAt(i) - 'a')]--;
        }

        for(int val :  arr){
            if (val != 0){
                return false;
            }
        }
        return true;
    }
}
