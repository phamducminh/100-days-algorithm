import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> listBinary = new ArrayList<>();
        int max = 0;
        int count = 0;
        int reminder;
        while (n > 0) {
            reminder = n % 2;
            n = n / 2;
            
            if (reminder == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}