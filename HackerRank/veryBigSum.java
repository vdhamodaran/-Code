/*
* https://www.hackerrank.com/challenges/a-very-big-sum
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class veryBigSum {

   static long largeInteger(long[] a) {

       long result=0;

       for(int i=0;i<a.length;i++){
           result += a[i];
       }
      return result;
    }

   public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long res;

        int N = Integer.parseInt(in.nextLine());

        long[] A = new long[N];

        String next = in.nextLine();

        String[] next_split = next.split(" ");

        long item;

        for(int i = 0; i < N; i++) {

            item = Long. valueOf(next_split[i]).longValue();
            A[i] = item;
        }

        res = largeInteger(A);
        System.out.println(res);

    }

}
