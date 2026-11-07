class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();

        for(char c : s.toCharArray()){
            int value = mapS.get(c) != null ? (mapS.get(c) + 1) : 1;
            mapS.put(c,value);
        }

        for(char c : t.toCharArray()){
            int value = mapT.get(c) != null ? (mapT.get(c) + 1) : 1;
            mapT.put(c,value);
        }
        
        return mapS.equals(mapT);
    }
}
