/*
* https://www.hackerrank.com/challenges/the-love-letter-mystery
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class loveLetterMistery {
    static int solve_Mystery(String Word){
        char[] word_Arr = Word.toCharArray();
        int count =0;
        int len=Word.length()-1;
        for(int k=0;k<word_Arr.length/2;k++){
            count += Math.abs((int)(word_Arr[k] - word_Arr[len]));
            len--;
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        for(int i=0;i<n;i++){
            String s = in.next();
            System.out.println(solve_Mystery(s));
        }
    }
}
