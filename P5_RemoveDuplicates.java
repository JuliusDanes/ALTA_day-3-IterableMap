import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class P5_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Input 1: ");
        s = input.nextLine();               // Contoh input [2, 3, 3, 3, 6, 9, 9]
        int[] arr = inputToIntArray(s);

        String str = Arrays.toString(new int[]{getArrayUnique(arr).length});
        System.out.println(str);
    }
    public static int[] inputToIntArray(String s) {
        String[] sArr = s.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");

        int size = sArr.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(sArr[i].trim());
        }
        return arr;
    }

    public static Integer[] getArrayUnique(int arr[]) {
        List<Integer> al = new ArrayList<Integer>();
        for (int i : arr) {
            boolean sts = true;
            for (int j : al) {
                if (i == j) {
                    sts = false;
                    break;
                }
            }
            if (sts) {
                al.add(i);
            }
        }
        return al.toArray(new Integer[0]);
    }
}
