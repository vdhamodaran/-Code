import java.io.*;
import java.util.*;

class rotateMatrix{
  static void transpose(int[][] m){
    int temp = 0;
    int k=0;
    for (int i=0;i<m.length ;i++,k++) {
      for (int j=k;j<m.length ;j++){
        if(i!=j){
          temp = m[i][j];
          m[i][j] = m[j][i];
          m[j][i] = temp;
        }
      }
    }
    reverse(m);
  }

  static void reverse(int[][] m){
    int temp = 0;
    int k=0;
    for (int i=0;i<m.length ;i++) {
      k=m.length-1;
      for (int j=0;j<(m.length)/2;j++,k--) {
        //System.out.println("-i-"+i+"-j-"+j+"-k-"+k);
        temp = m[i][j];
        m[i][j] = m[i][k];
        m[i][k] = temp;
      }
    }

    System.out.println("--90 degree Shift--");
    for (int i=0;i<m.length ;i++) {
      for (int j=0;j<m.length ;j++ ) {
      System.out.print(" "+m[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      //Matrix input
      int[][] matrix = new int[N][N];
      for (int i=0;i<N ;i++) {
        for (int j=0;j<N ;j++ ) {
        matrix[i][j]=in.nextInt();
        }
      }

      System.out.println("--Original Matrix--");
      for (int i=0;i<matrix.length ;i++) {
        for (int j=0;j<matrix.length ;j++ ) {
        System.out.print(" "+matrix[i][j]);
        }
        System.out.println();
      }
        transpose(matrix);
  }

}
