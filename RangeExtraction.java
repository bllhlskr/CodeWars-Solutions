/*A format for expressing an ordered list of integers is to use a comma separated list of either

individual integers
or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'. The range includes all integers in the interval including both endpoints. It is not considered a range unless it spans at least 3 numbers. For example ("12, 13, 15-17")
Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.

Example:

Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-6,-3-1,3-5,7-11,14,15,17-20"*/

import java.util.Arrays;
class Solution {
public static String rangeExtraction(int[] arr) {
    int count =0;
     String newString ="";
  for (int i = 0; i < arr.length-1; i++) {
    if(arr[i]+1==arr[i+1]) {
      count++;
      if(i==arr.length-2 && count>=2) {
        newString+=arr[i-count+1];
        newString+="-"+arr[i+1];
      }if(i==arr.length-2 && count==1) {
        newString+=arr[i]+",";
        newString+=arr[i+1];
      }
      //System.out.println(count);
    }else {
      if(count>=2) {
        newString+=arr[i-count];
        newString+="-"+arr[i]+",";
        //newString+=arr[i]+",";
        if(i==arr.length-2) {
          newString+=arr[i+1];
        }
      } if(count ==1) {
        newString+=arr[i-1]+",";
        newString+=arr[i]+",";
        if(i==arr.length-2) {
          newString+=arr[i+1];
        }
        
      } if(count==0) {
        newString+=arr[i]+",";
        if(i==arr.length-2) {
          newString+=arr[i+1];
        }
        
      }
      count=0;
    }
  }
  return newString;

}
}