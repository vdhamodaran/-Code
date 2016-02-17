import java.io.*;
import java.util.*;

class URLify{
  static void toURL(String _input,int n){
    StringBuffer input = new StringBuffer(_input);
    for(int i=0;i<n;i++){
      if(input.charAt(i) == ' '){
        input.replace(i,i+1,"%20");
        n+=2;
      }
      System.out.print(input.charAt(i));
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String _input = in.nextLine();
    String[] temp = _input.split(",");
    String input = temp[0];
    int n = Integer.parseInt(temp[1]);
    toURL(input,n);
  }
}
