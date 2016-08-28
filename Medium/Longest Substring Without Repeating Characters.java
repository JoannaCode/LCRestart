public class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max = 0;
      int start = 0;
      int end = 0;
      if(s.isEmpty()){
          return 0;
      }
      max = 1;
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      char stringArray[] = s.toCharArray();
      while(end < s.length()){
          if(map.containsKey(stringArray[end])){
              if((end - start) > max)
                max = end - start ;
              if(map.get(stringArray[end]) >= start)
                start = map.get(stringArray[end]) + 1 ;
          }
          map.put(stringArray[end], end);
          end++;
      }
      return Math.max(max, end - start);
    }
}