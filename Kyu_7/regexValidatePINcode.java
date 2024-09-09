/*
    ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

    If the function is passed a valid PIN string, return true, else return false.

    Examples (Input --> Output)
    "1234"   -->  true
    "12345"  -->  false
    "a234"   -->  false
 */
public class regexValidatePINcode {
    public static boolean validatePin(String pin) {
    
        System.out.println(pin);
        if(pin.length() == 4 || pin.length() == 6){

            for(int i = 0; i < pin.length(); i++){
              try{
                Integer.parseInt(Character.toString(pin.charAt(i)));
              } catch(Exception e){
                return false;
              } 
            }
          
          return true;
        } else{
          return false;
        }
        
      }
    }
