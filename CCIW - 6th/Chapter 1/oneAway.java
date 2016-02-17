import java.io.*;
import java.util.*;

class oneAway{

  static boolean compare(String _A, String _B){

    char[] A = _A.toCharArray();
    char[] B = _B.toCharArray();
    int counter = 0;
    int j =0;

    if(!(Math.abs(A.length-B.length)>1)){
      if(A.length>B.length){
        for(int i=0;i<B.length;i++,j++){
          if(A[j]!=B[i]){
            counter++;
            j+=i;
          }
          if(counter > 1 ){
            return false;
          }
        }
      }
      else{
        for(int i=0;i<A.length;i++,j++){
          if(A[i]!=B[j]){
            counter++;
            j+=i;
          }
          if(counter > 1 ){
            return false;
          }
        }
      }
      if(counter <= 1 ){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String _in = in.nextLine();
    String[] input = _in.split(" ");
    System.out.println(compare(input[0],input[1]));
  }
}
