/*
    Find the missing letter
    Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

    You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
    The array will always contain letters in only one case.

    Example:

    ['a','b','c','d','f'] -> 'e'
    ['O','Q','R','S'] -> 'P'
    (Use the English alphabet with 26 letters!)
 */

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array)
  {
    int previous;
    int next;
    int toReturn = 0;
    
    for(int i = 0; i < array.length; i++){
      previous = array[i] - '0';
      next = array[i + 1] - '0';
      if(next != previous + 1){
        toReturn = (previous + '0');
        return  (char) (toReturn + 1);
      }
      
      System.out.println(array[i]);
    }
    return ' ';
  }
}
