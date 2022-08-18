import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.*;

public class P2_AngkaMunculSekali {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s, pattern, ss="";
        char[] cc;
        System.out.print("Input: ");
        s = input.nextLine();

        for (char c: s.toCharArray()) {
            pattern = "[0-9]*["+String.valueOf(c)+"]+[0-9]*["+String.valueOf(c)+"]+[0-9]*";
                if (!s.matches(pattern)) {
                    ss += String.valueOf(c);
            }
        }

        cc = ss.toCharArray();
        System.out.println(cc);
    }
}
