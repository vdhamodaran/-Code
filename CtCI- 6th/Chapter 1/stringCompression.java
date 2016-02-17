import java.io.*;
import java.util.*;

class stringCompression{

  static void compressedString(String _input){
    char[] input = _input.toCharArray();
    StringBuilder buffer = new StringBuilder();
    //  int j=0;
    char prev= input[0];
    if(input.length==1){
      System.out.println(buffer.append(prev));
    }
    else{
      int counter=1;
      for(int i=1;i<input.length;i++){
        char current = input[i];
        if(prev==current){
          counter++;
        }
        else{
          buffer.append(prev+""+counter);
          counter=1;
        }
        prev=current;
      }

      System.out.println(buffer.append(prev+""+counter));
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String _input = in.nextLine();
    compressedString(_input);
  }
}
