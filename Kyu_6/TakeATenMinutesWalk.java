public class TakeATenMinutesWalk {
    public static boolean isValid(char[] walk) {
        int n = 0;
        int s = 0;
        int e = 0;
        int w = 0;
        for(char letter : walk){
          switch(Character.toString(letter)){
              case "n":
                n+=1;
                s-=1;
                break;
              case "s":
                n-=1;
                s+=1;
                break;
              case "e":
                w-=1;
                e+=1;
                break;
              case "w":
                e-=1;
                w+=1;
                break;
          }
          
        }
    //     System.out.println(walk.length);
        return (n == 0 && s == 0 && w == 0 && w == 0 && walk.length == 10);
      }
}
