/*
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

    Examples
    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
 */
public class SimplePigLatin {
    public static String pigIt(String str) {
      
        String[] stringArray = str.split(" ");;
        String newWord = "";
        String wordToReturn = "";
        String firstLetter = "";
        Boolean specialCaracters = false;
      
        int iteration = 0;
        for (String word : stringArray){
          int count = 0;
          for(int i = 0; i < word.length(); i++){
            
                if(!Character.isLetter(word.charAt(i)) && !Character.isWhitespace(word.charAt(i))){
                  specialCaracters = true;
                }
                if(count == 0){
                  count++;
                  firstLetter = Character.toString(word.charAt(i));
                } else{
                  wordToReturn += Character.toString(word.charAt(i));
                }
          }
          iteration++;
          if (!specialCaracters){
              if(iteration == stringArray.length){
                  System.out.println("i am heere");
                  wordToReturn = wordToReturn + firstLetter + "ay";
              } else{
              wordToReturn = wordToReturn + firstLetter + "ay" + " ";
              } 
          } else{
            wordToReturn += firstLetter;
          }
          count = 0;
          firstLetter = "";
//           System.out.println(wordToReturn);
        }
      System.out.println(wordToReturn);
      return wordToReturn;
}
}
