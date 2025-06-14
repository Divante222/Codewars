// Given an array of integers.

// Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

// If the input is an empty array or is null, return an empty array.

// Example
// For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
      if(input == null){
        return new int[0];
      } else if(input.length == 0){
        return new int[0];
        }
      else {
        int[] arrayToReturn = new int[2];
        arrayToReturn[0] = (int) Arrays.stream(input).filter(x -> x > 0).count();
        arrayToReturn[1] = (int) Arrays.stream(input).filter(x -> x < 1).sum();
        return arrayToReturn;
      }
    }
}

// import java.util.stream.*;

// public class Kata {

//   public static int[] countPositivesSumNegatives(int[] input) {
//     return input == null || input.length == 0 ? 
//       new int[0] : 
//       new int[] { (int)IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
//   }
// }