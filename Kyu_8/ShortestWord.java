public class ShortestWord {
    public static int findShort(String s) {
        int min = -1;
      
        for(String words : s.split(" ")){
          if(min == -1){
            min = words.length();
          } else if (min > words.length()){
            min = words.length();
          }
        };
      
        return min;
    }
}
