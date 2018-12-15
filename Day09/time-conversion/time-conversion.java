import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String hour = s.substring(0, 2);
        String newHour;
        if ("AM".equals(s.substring(s.length() - 2))) {
            newHour = "12".equals(hour) ? "00" : hour;
        } else {
            newHour = "12".equals(hour) ? hour : String.valueOf(Integer.parseInt(hour)+12);
        }

        return newHour + s.substring(2, 8);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}