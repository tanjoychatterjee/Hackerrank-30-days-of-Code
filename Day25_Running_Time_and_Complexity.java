import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int n = scan.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        scan.close();
    }
    
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {    
            return true;
        } else if (n % 2 == 0) { 
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) { //  for faster results
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    
    }
}



