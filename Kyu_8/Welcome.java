
    import java.util.*;


    /*
     * Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.

        The Task
        Think of a way to store the languages as a database. The languages are listed below so you can copy and paste!
        Write a 'welcome' function that takes a parameter 'language', with a type String, and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
        The Database
        Please modify this as appropriate for your language.

        [ ("english", "Welcome")
        , ("czech", "Vitejte")
        , ("danish", "Velkomst")
        , ("dutch", "Welkom")
        , ("estonian", "Tere tulemast")
        , ("finnish", "Tervetuloa")
        , ("flemish", "Welgekomen")
        , ("french", "Bienvenue")
        , ("german", "Willkommen")
        , ("irish", "Failte")
        , ("italian", "Benvenuto")
        , ("latvian", "Gaidits")
        , ("lithuanian", "Laukiamas")
        , ("polish", "Witamy")
        , ("spanish", "Bienvenido")
        , ("swedish", "Valkommen")
        , ("welsh", "Croeso")
        ]
        Possible invalid inputs include:

        IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
        IP_ADDRESS_NOT_FOUND - ip address not in the database
        IP_ADDRESS_REQUIRED - no ip address was supplied
     */
    public class Welcome {
       public static String greet(String language){
       
         List<Map<String, String>> listOfGreetings = new ArrayList<>();
         Map<String,String> theMap = new HashMap<>();
         theMap.put("english", "Welcome");
         theMap.put("czech", "Vitejte");
         theMap.put("danish", "Velkomst");
         theMap.put("dutch", "Welkom");
         theMap.put("estonian", "Tere tulemast");
         theMap.put("finnish", "Tervetuloa");
         theMap.put("flemish", "Welgekomen");
         theMap.put("french", "Bienvenue");
         theMap.put("german", "Willkommen");
         theMap.put("irish", "Failte");
         theMap.put("italian", "Benvenuto");
         theMap.put("latvian", "Gaidits");
         theMap.put("lithuanian", "Laukiamas");
         theMap.put("polish", "Witamy");
         theMap.put("spanish", "Bienvenido");
         theMap.put("swedish", "Valkommen");
         theMap.put("welsh", "Croeso");
    
         listOfGreetings.add(theMap);
         System.out.println("the greeting: " + listOfGreetings.get(0).get(language));
         System.out.println("the language: " + language);
         
        if(listOfGreetings.get(0).get(language) != null){
          return listOfGreetings.get(0).get(language);
        } else{
          return "Welcome";
        }
       }
    }