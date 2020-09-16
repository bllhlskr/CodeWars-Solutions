/*
 Write a function that takes in a string of one or more words, and returns the same string, 
 but with all five or more letter words reversed (Just like the name of this Kata). 
 Strings passed in will consist of only letters and spaces. Spaces will be included only when more than 
 one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") 
=> returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
  */
public class SpinWords {

  public static String spinWords(String sentence) {
      //TODO: Code stuff here
    String[] newStringArray = sentence.split(" ");
    StringBuilder sb= new StringBuilder();
    
    for (int i = 0; i < newStringArray.length; i++) {
      sb.append(newStringArray[i]);
      if(newStringArray[i].length()>=5) {
        
        newStringArray[i]=  sb.reverse().toString();
        
      }
      
      sb.setLength(0);
    }
    String finalString = "";
    for (int i = 0; i < newStringArray.length; i++) {
      if(i==newStringArray.length-1) {
        finalString += newStringArray[i];
      }else {
        finalString += newStringArray[i]+" ";
      }
    }
    return finalString;
    }
}