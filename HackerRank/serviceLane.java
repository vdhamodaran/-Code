/*
* https://www.hackerrank.com/challenges/service-lane
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class serviceLane {
    static int service_Lane(int x,int y,int[] w){
        int min=4;
        for(int k=x;k<=y;k++){
            if(w[k]<min){
                min = w[k];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */         Scanner in = new Scanner(System.in);
        int lane;
        lane = in.nextInt();
        int n,a,b,result;
        n=in.nextInt();
        int[] width=new int[lane];
        for(int i=0;i<lane;i++){
            width[i]=in.nextInt();
        }
        for(int j=0;j<n;j++){
            a=in.nextInt();
            b=in.nextInt();
            result=service_Lane(a,b,width);
            System.out.println(result);
        }

    }
}
