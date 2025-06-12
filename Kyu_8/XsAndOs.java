// Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

// Examples input/output:

// XO("ooxx") => true
// XO("xooxx") => false
// XO("ooxXm") => true
// XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
// XO("zzoo") => false

public class XsAndOs {
  
  public static boolean getXO (String str) {
    
    int xNumber = 0;
    int oNumber = 0;
    for(char character : str.toCharArray()){
      
        if(character == 'x' || character == 'X'){
          xNumber += 1;
        } 

        else if (character == 'o' || character == 'O'){
          oNumber += 1;
        }
    }
    return xNumber == oNumber;
  }
}