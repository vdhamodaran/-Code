import java.io.*;
import java.util.*;

class stringRotation{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String _input = in.nextLine();
    String[] input = _input.split(" ");
    if(input[0].length()!=input[1].length()){
      System.out.println(false);
    }
    else{
      String temp = input[1]+""+input[1];
      if(temp.contains(input[0])){
        System.out.println(true);
      }
      else{
        System.out.println(false);
      }
    }
  }
}
