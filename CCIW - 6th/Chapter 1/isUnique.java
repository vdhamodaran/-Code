import java.io.*;
import java.util.*;

class isUnique{
  static boolean checkUnique(String _input){
      char[] input = _input.toCharArray();
      char curr = input[0];
      for (int i=1;i<input.length ;i++ ) {
        char next=input[i];
        if(curr==next){
          return false;
        }
        curr = input[i];
      }
      return true;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String _input = in.nextLine();
    System.out.println(checkUnique(_input));
  }
}
