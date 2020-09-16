/*
 Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
 Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway ! */
public class PigLatin {
public static String pigIt(String str) {
    // Write code here
  StringBuilder sb = new StringBuilder() ;
char a=(char)0;
  String[] newArray = str.split(" ");
  for (int i = 0; i < newArray.length; i++) {
    sb.append(newArray[i]);
    for (int j = 0; j <newArray.length; j++) {
      if(!newArray[i].equals("!")&& !newArray[i].equals("?")) {
        if(j==0) {
          a = newArray[i].charAt(0);
          sb.delete(0, 1);
          sb.append(a);
          newArray[i] = sb.toString();
        }
        if(j==newArray.length-1) {
          
          newArray[i] +="ay";
        }
      }
    
    }
    sb.setLength(0);
  }
  String newString = "";
  for (int i = 0; i < newArray.length; i++) {
    
    if(i==newArray.length-1) {
      newString += newArray[i];
    }else {
      newString += newArray[i]+" ";
    }
  }
  for (int i = 0; i < newArray.length; i++) {
    System.out.println(newArray[i]);
  }
  System.out.println(newString);
  return newString;
    
}
}
