// The goal of this exercise is to convert a string to a new string where each character in the new string is "(" 
// if that character appears only once in the original string, or ")" if that character appears more than once in the original string. 
// Ignore capitalization when determining if a character is a duplicate.

// Examples
// "din"      =>  "((("
// "recede"   =>  "()()()"
// "Success"  =>  ")())())"
// "(( @"     =>  "))((" 

import java.util.*;
public class DuplicateEncoder {
	static String encode(String word){
    Map<String, Integer> letters = new HashMap<>();
    String newWord = "";
    for(int i = 0; i < word.length(); i++){
      
      
      
      if(!letters.containsKey(Character.toString(word.charAt(i))) ){
        letters.putIfAbsent(Character.toString(word.charAt(i)).toLowerCase(), 1);
      } else{
        int numberToAdd = letters.get(Character.toString(word.charAt(i)).toLowerCase());
        letters.put(Character.toString(word.charAt(i)).toLowerCase(), numberToAdd + 1);
      }

    }
    
      for(int i = 0; i < word.length(); i++){
        if(letters.get(Character.toString(word.charAt(i)).toLowerCase()) == 1){
          newWord += "(";
        } else{
          newWord += ")";
        }
      }
    System.out.println(word);
    System.out.println(newWord);
    return newWord;
  }
}
