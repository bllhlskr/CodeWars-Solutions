/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 */
class Persist {
static int count = 1;
  public static int persistence(long n) {
    // your code
    long  num = n;
    System.out.println(n);
        String num2 = String.valueOf(n);
        
        int[] numarray = new int [num2.length()]; 
        
        for(int i =0;i<num2.length();i++){
        numarray[i] = Math.toIntExact(num%10);
        num =num/10;
        
        }
        num = n;
        int newnum=1;
        for(int i =0;i<num2.length();i++){
        newnum = numarray[i]*newnum;
        }
       // System.out.println(newnum);
        if(n/10 == 0) {
          return 0;
        }else {
          
        
        if(newnum/10 !=0 ){
          count+=1;
       return persistence(newnum);
        }else{
        System.out.println("count is : " +count);
        int count2 = count;
          count = 1;
        return count2;
        }}
  }
}