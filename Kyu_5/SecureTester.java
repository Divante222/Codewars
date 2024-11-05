// In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

// The string has the following conditions to be alphanumeric:

// At least one character ("" is not valid)
// Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
// No whitespaces / underscore

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class SecureTester{
      
      public static boolean alphanumeric(String s){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher;
        boolean matchFound;
        if(s.equals("")){
          return false;
        }
        for(char character : s.toCharArray()){
          matcher = pattern.matcher(Character.toString(character));
          matchFound = matcher.find();
          if(matchFound == false){
            return false;
          }
        }
        return true;
      }
    }
