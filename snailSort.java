/*Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
*/

//Solution

import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
       // enjoy
     int size =array.length;
      if(array[0].length==0) {
      return new int[]{};
    }
     int[] arr = new int[array.length*array.length];
    ArrayList<Integer> snailArray = new ArrayList<>();
     for (int l = 0; l < size ; l++)
        {
            int min = l;
            int max = size - 1 - l;
            for (int i = min; i <= max; i++) {
              snailArray.add(array[min][i]);

            }
            for (int j = min+1; j < max; j++) {
              snailArray.add(array[j][max]);

            }
            for (int i = max; i > min; i--) {
              snailArray.add(array[max][i]);

            }
            for (int j = max; j > min; j--) {
              snailArray.add(array[j][min]);

            }
                
       
         //  System.out.println("******");
           
        }
        for (int i = 0; i < snailArray.size(); i++) {
            arr[i] = snailArray.get(i);
          }
               return arr;
    
     
     

     
     
     
     } 
}