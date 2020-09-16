/*
 Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  "" 
  */
import java.util.*;
public class Order {

 public static String order(String words) {
        // ...
    
     if(words.equals("")) {
       return "";
     }
     ArrayList<String> newArray = new ArrayList<>();
     
     String number = "";
     String temp="";
     char a = 0;
     String newWord = "";
    for (int i = 0; i < words.length(); i++) {
      
      if(Character.isWhitespace(words.charAt(i))) {
        newArray.add(newWord);
        newWord ="";
        continue;
      }
      newWord+= words.charAt(i);
        
    }
    newArray.add(newWord);
    String[] finalArray = new String[newArray.size()];

    
     for (int i = 0; i < newArray.size(); i++) {
       System.out.println(newArray.get(i) +" " + i);
      for (int j = 0; j < newArray.get(i).length(); j++) {
        
        if(Character.isDigit(newArray.get(i).charAt(j))) {
          a = newArray.get(i).charAt(j);
          
        }
        
        
      }
      finalArray[Character.getNumericValue(a)-1]=newArray.get(i);

      
      
      
    }

    
    
    
     if(words.equals("")) {
       return "";
     }
    String newString= String.join(" ", finalArray);
     
   return newString;
      }
}
