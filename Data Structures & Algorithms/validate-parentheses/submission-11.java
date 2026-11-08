class Solution {
    public boolean isValid(String s) {
        // creating a map for ( -> ), { -> }, [ -> ]
        HashMap<String, String> map = new HashMap<>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        ArrayList<String> clsArr = new  ArrayList<>();
        // populating closing array 
        for(char c : s.toCharArray()){
            String strC = String.valueOf(c);
            if(map.containsKey(strC)){
                clsArr.add(map.get(strC));
            }else{
                if(clsArr.isEmpty()){
                    return false;
                }else{
                    if(!((String.valueOf(c)).equals(clsArr.remove(clsArr.size() - 1)))){
                    return false;
                    }
                }     
            }

        }
        // looping string to look for closing array
        //for(char c : s.toCharArray()){
        //    if(map.get(String.valueOf(c)) == null){
        //        if(clsArr.size() <= 0){
        //            return false;
        //        }else{
        //            if(!((String.valueOf(c)).equals(clsArr.remove(0)))){
        //            return false;
         //           }
          //      }
                
           // }
        //}
        if(clsArr.size() >0){
            return false;
        }
        return true;
    }
}
