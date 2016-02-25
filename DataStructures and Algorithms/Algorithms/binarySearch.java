/*
* Complexit is O(logn) since we use divide and conquer to solve the problem
*/

import java.io.*;
import java.util.*;

class binarySearch{
  static int search(int[] arr,int element,int low,int high){
    if(low>high) throw new NoSuchElementException();
    else {
      int mid = (low+high)/2;
      if(arr[mid]==element){
         return mid;
       }
      else if (arr[mid]>element){
        return search(arr,element,low,mid-1);
      }
      else{
        return search(arr,element,mid+1,high);
      }
    }
  }
  public static void main(String[] args) {
     int[] input ={2,3,4,5,6,7,8,9,10};
     System.out.println(search(input,9,0,input.length-1));
     System.out.println(search(input,3,0,input.length-1));
  }
}
