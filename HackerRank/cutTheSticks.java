/* Problem Statement
https://www.hackerrank.com/challenges/cut-the-sticks
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cutTheSticks {
    static int findMin(int arr[]){
        int min = 9999;
        for(int i=0;i<arr.length;i++){
             if((arr[i]<min)&&(arr[i]>0)){
                min = arr[i];
            }
        }
        return min;
    }
    static void stickLength(int arr[],int min){
        int s_len=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                s_len+=1;
            }
            arr[i] = arr[i]-min;
        }
        System.out.println(s_len);
        if(s_len>1){
           stickLength(arr,findMin(arr));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        stickLength(arr,findMin(arr));
    }
}
