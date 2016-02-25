/*
 * https://www.hackerrank.com/challenges/utopian-tree
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class uTopianTree {

    static int utopian_tree(int b){
        int temp=1;
        if(b==0){
            return 1;
        }
        else{
            for (int j=1;j<=b;j++) {
              if((j%2)==0){
                  temp=temp+1;
              }
              else{
                  temp=temp*2;
              }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n,a,x;
        n = in.nextInt();
        for (int i=0;i<n;i++) {
            a = in.nextInt();
            x = utopian_tree(a);
            System.out.println(x);
        }

    }
}
