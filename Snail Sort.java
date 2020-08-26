{\rtf1\ansi\ansicpg1252\cocoartf1561\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue-Bold;\f1\fnil\fcharset0 HelveticaNeue;\f2\fmodern\fcharset0 Courier;
\f3\fnil\fcharset0 Menlo-Regular;\f4\fmodern\fcharset0 Courier-Oblique;}
{\colortbl;\red255\green255\blue255;\red255\green255\blue255;\red29\green29\blue31;\red0\green0\blue0;
\red235\green235\blue235;}
{\*\expandedcolortbl;;\cssrgb\c100000\c100000\c100000;\cssrgb\c14902\c15294\c16078;\cssrgb\c0\c0\c0;
\cssrgb\c93725\c93725\c93725;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl460\sa360\partightenfactor0

\f0\b\fs36 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 /*Snail Sort\cf4 \
\pard\pardeftab720\sl500\sa400\partightenfactor0

\f1\b0\fs32 \cf5 \strokec5 Given an\'a0
\f2\fs28 n x n
\f1\fs32 \'a0array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.\
\pard\pardeftab720\sl360\partightenfactor0

\f2\fs21 \cf4 \cb1 \strokec4 array = [[1,2,3],\
         [4,5,6],\
         [7,8,9]]\
snail(array) #=> [1,2,3,6,9,8,7,4,5]
\f3 \
\pard\pardeftab720\sl500\sa400\partightenfactor0

\f1\fs32 \cf5 \cb3 \strokec5 For better understanding, please follow the numbers of the next array consecutively:\
\pard\pardeftab720\sl360\partightenfactor0

\f2\fs21 \cf4 \cb1 \strokec4 array = [[1,2,3],\
         [8,9,4],\
         [7,6,5]]\
snail(array) #=> [1,2,3,4,5,6,7,8,9]
\f3 \
\pard\pardeftab720\sl360\partightenfactor0

\fs48 \cf4 Solution*/\

\fs21 \
\pard\pardeftab720\sl360\partightenfactor0

\f2 \cf4 import java.util.ArrayList;\
\
public class Snail \{\
\
    public static int[] snail(int[][] array) \{\
       
\f4\i // enjoy
\f2\i0 \
     int size =array.length;\
      if(array[0].length==0) \{\
      return new int[]\{\};\
    \}\
     int[] arr = new int[array.length*array.length];\
    ArrayList<Integer> snailArray = new ArrayList<>();\
     for (int l = 0; l < size ; l++)\
        \{\
            int min = l;\
            int max = size - 1 - l;\
            for (int i = min; i <= max; i++) \{\
              snailArray.add(array[min][i]);\
\
            \}\
            for (int j = min+1; j < max; j++) \{\
              snailArray.add(array[j][max]);\
\
            \}\
            for (int i = max; i > min; i--) \{\
              snailArray.add(array[max][i]);\
\
            \}\
            for (int j = max; j > min; j--) \{\
              snailArray.add(array[j][min]);\
\
            \}\
                \
       \
         
\f4\i //  System.out.println("******");
\f2\i0 \
           \
        \}\
        for (int i = 0; i < snailArray.size(); i++) \{\
            arr[i] = snailArray.get(i);\
          \}\
               return arr;\
    \
     \
     \
\
     \
     \
     \
     \} \
\}
\f3 \
\pard\pardeftab720\sl360\partightenfactor0
\cf4 \
}