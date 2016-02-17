import java.io.*;
import java.util.*;

class checkPermutation{
  static boolean isPermutation(String _A, String _B){
    char[] A = _A.toCharArray();
    char[] B = _B.toCharArray();
    Arrays.sort(A);
    Arrays.sort(B);
    if(Arrays.equals(A,B)){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String _input = in.nextLine();
    String[] input = _input.split(" ");
    System.out.println(isPermutation(input[0],input[1]));
  }
}
