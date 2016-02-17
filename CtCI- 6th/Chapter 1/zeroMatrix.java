import java.io.*;
import java.util.*;

class zeroMatrix{

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int M = in.nextInt();
    int N = in.nextInt();
    ArrayList<Integer> col = new ArrayList<Integer>();
    ArrayList<Integer> row = new ArrayList<Integer>();

    int[][] matrix = new int[M][N];
    for (int i=0;i<M ;i++) {
      for (int j=0;j<N ;j++ ) {
        matrix[i][j]=in.nextInt();
        if(matrix[i][j] == 0){
          row.add(i);
          col.add(j);          
        }
      }
    }
    System.out.println("--Original Matrix--");
    for (int i=0;i<M ;i++) {
      for (int j=0;j<N ;j++ ) {
        System.out.print(" "+matrix[i][j]);
      }
      System.out.println();
    }
    for(int k=0;k<row.size();k++){
      for (int i=0;i<N ;i++) {
        matrix[row.get(k)][i]=0;
      }
      for (int i=0;i<M ;i++) {
        matrix[i][col.get(k)]=0;
      }
    }
    System.out.println("--Resultant Matrix--");
    for (int i=0;i<M ;i++) {
      for (int j=0;j<N ;j++ ) {
        System.out.print(" "+matrix[i][j]);
      }
      System.out.println();
    }
  }

}
