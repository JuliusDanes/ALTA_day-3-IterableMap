import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.regex.*;

public class P1_ArrayMerge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.print("Input 1: ");
        s1 = input.nextLine();              // Contoh input ['kazuya', 'jin', 'lee']
        System.out.print("Input 2: ");
        s2 = input.nextLine();              // Contoh input ['kazuya', 'feng']

        String[] arr1 = inputToStringArray(s1);
        String[] arr2 = inputToStringArray(s2);

        System.out.println(Arrays.toString(getArrayMerge(arr1, arr2)));
    }
    public static String[] inputToStringArray(String s) {
        String[] sArr = s.replaceAll("[\\[\\]' ]+", "")
                .split(",");

        int size = sArr.length;
        String[] arr = new String [size];
        for(int i=0; i<size; i++) {
            arr[i] = sArr[i];
        }
        return arr;
    }

    public static String[] getArrayMerge(String arr1[], String arr2[]) {
        String[] arrMerge = new String[arr1.length+ arr2.length];
        int i=0;
        for (String s: arr1) {
            arrMerge[i] = s;
            i++;
        }
        for (String s: arr2) {
            arrMerge[i] = s;
            i++;
        }
        return getRemoveDuplicate(arrMerge);
    }
    public static String[] getRemoveDuplicate(String arr[]) {
        List<String> al = new ArrayList<String>();
        for (String i : arr) {
            boolean sts = true;
            for (String j : al) {
                if (i.equals(j)) {
                    sts = false;
                    break;
                }
            }
            if (sts) {
                al.add(i);
            }
        }
        return al.toArray(new String[0]);
    }
}
