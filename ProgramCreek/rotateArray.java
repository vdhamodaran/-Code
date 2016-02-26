import java.io.*;
import java.util.*;

class rotateArray{
  static int[] rotate(int[] input,int K){
    K = K%input.length;
    int p = input.length-K;
    int[] result = new int[input.length];
    for (int i=p,j=0;i<input.length;i++,j++ ) {
      result[j]=input[i];
    }
    for (int i=K,j=0;j<p;i++,j++ ) {
      result[i]=input[j];
    }
    return result;
  }
  public static void main(String[] args) {
    int[] input = {1,2,3,4,5,6};
    System.out.println("Enter order: ");
    Scanner in = new Scanner(System.in) ;
    int K = in.nextInt();
    System.out.println(Arrays.toString(rotate(input,K)));
  }
}
