import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int cnt = 0;
        for(int i= 0;i<n;i++){
            int tot = arr[i];
            if(tot < 0){
                cnt++;
            }
            for(int j = i+1;j<n;j++){
                tot += arr[j];
                if(tot < 0){
                    cnt++;
                }
            }
        
        }
        System.out.println(cnt);
    }
}
