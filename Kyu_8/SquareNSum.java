import java.lang.Math;

public class Kata
 {
  public static int squareSum(int[] n)
    { 
        int total = 0;
        for(int num : n){
            total += Math.pow(num, 2);
        }
      return total;
    }
 }