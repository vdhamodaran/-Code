/*
* Using the property of HashSets that it wont add duplicate elements into it to solve it .
*/

import java.io.*;
import java.util.*;

class findRemDuplicates{
  static Set<Integer> findDups(int[] arr){
    Set<Integer> toRet = new HashSet();
    Set<Integer> temp = new HashSet();
    for (int x : arr ) {
      if(!(temp.add(x))){
        toRet.add(x);
      }
    }
    return toRet;
  }
  static Set<Integer> remDups(int[] arr){
    Set<Integer> toRet = new HashSet();
    Set<Integer> temp = new HashSet();
    for (int x : arr ) {
      if((temp.add(x))){
        toRet.add(x);
      }
    }
    return toRet;
  }
  public static void main(String[] args) {
    int[] input = {1,2,2,3,3,5};
    System.out.println("Duplicates: "+findDups(input));
    System.out.println("Without Duplicates"+remDups(input));
  }
}
