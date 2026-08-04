class Solution {
    public int romanToInt(String s) {

       HashMap<Character, Integer> Map = new HashMap<>();
      Map.put('I',1);
      Map.put('V',5);
      Map.put('X',10);
      Map.put('L',50);
      Map.put('C',100);
      Map.put('D',500);
      Map.put('M',1000);

      int total=0;
      int i=0;

      while(i<s.length()){
          if(i+1<s.length() && Map.get(s.charAt(i))< Map.get(s.charAt(i+1))){
            total+=Map.get(s.charAt(i+1))-Map.get(s.charAt(i));
            i+=2;
        }else{
            total+=Map.get(s.charAt(i));
            i+=1;
        }
      }

      return total;

        
    }
}