import java.io.*;
import java.util.*;

class findIslands{
  static int countIslands(int[][] matrix){
    if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
    int count=0;
    for (int i=0;i<matrix.length ;i++) {
      for (int j=0;j<matrix[0].length ;j++ ) {
        if(matrix[i][j]==1){
          count ++;
          checkNeighours(matrix,i,j);
        }
      }
    }
    return count;
  }
  static void checkNeighours(int[][] matrix,int i,int j){
    if(i<0||j<0||i>matrix.length-1||j>matrix.length-1) return;
    if(matrix[i][j]==0) return;
    matrix[i][j]=0;
    checkNeighours(matrix,i-1,j);//up
    checkNeighours(matrix,i+1,j);//down
    checkNeighours(matrix,i,j-1);//right
    checkNeighours(matrix,i,j+1);//left
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int M = in.nextInt();
    int N = in.nextInt();
    int[][] matrix = new int[M][N];
    for (int i=0;i<M ;i++) {
      for (int j=0;j<N ;j++ ) {
        matrix[i][j]=in.nextInt();
      }
    }
    System.out.println("--Original Matrix--");
    for (int i=0;i<matrix.length ;i++) {
      for (int j=0;j<matrix[0].length ;j++ ) {
        System.out.print(" "+matrix[i][j]);
      }
      System.out.println();
    }
    System.out.println("No of Islands:: "+countIslands(matrix));
  }


}
