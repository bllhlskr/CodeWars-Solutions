/*
The goal of this exercise is to convert a string to a new string where each character in
 the new string is "(" if that character appears only once in the original string, or ")" if that 
 character appears more than once in the original string. Ignore capitalization when determining if a 
 character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
Notes

Assertion messages may be unclear about what they display in some languages. 
If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class DuplicateEncoder {
  static String encode(String word){
String newWord = word.toLowerCase();
System.out.println(newWord);
ArrayList<Character> charArray = new ArrayList<>();
for (int i = 0; i < newWord.length(); i++) {
  for (int j = i+1; j < newWord.length(); j++) {
    if(newWord.charAt(i)==newWord.charAt(j)) {
      charArray.add(newWord.charAt(i));
      charArray.add(newWord.charAt(j));

    }
  }
}
HashSet<Character> set = new HashSet<>(charArray);
charArray.clear();
charArray.addAll(set);
String newString = "";
for (int i = 0; i <charArray.size(); i++) {
  
  System.out.println(charArray.get(i));
}
boolean flag = true;
for (int i = 0; i < newWord.length(); i++) {
  flag = true;
  for (int j = 0; j < charArray.size(); j++) {
    if(newWord.charAt(i)==charArray.get(j)) {
      //System.out.print(newWord.charAt(i));
      newString += ")";
    flag =false;

  }
}
  //System.out.println(flag + " "+i);
  if(flag == true) {
    //System.out.print(newWord.charAt(i));
    newString += "(";
  }// )([)())()(()()](

}

    return newString;
     
  }
}