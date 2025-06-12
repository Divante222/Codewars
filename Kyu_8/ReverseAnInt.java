// Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

// Example (Input => Output):
// 35231 => [1,3,2,5,3]
// 0     => [0]

public class ReverseAnInt {
  public static int[] digitize(long n) {
    
    String numbers = new StringBuilder(String.valueOf(n)).reverse().toString();
    
    int[] returnedArray = new int[numbers.length()];
    
    int index = 0;
    
    for(char character : numbers.toCharArray()){
      
      returnedArray[index] = Character.getNumericValue(character);
      
      index++;
    }
    return returnedArray;
  }
}


// class Kata {
//   static int[] digitize(long n) {
//     return new StringBuilder(String.valueOf(n))
//         .reverse()
//         .chars()
//         .map(Character::getNumericValue)
//         .toArray();
//   }
// }