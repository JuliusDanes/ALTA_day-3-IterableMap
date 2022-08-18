import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class P4_ArrayUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.print("Input 1: ");
        s1 = input.nextLine();               // Contoh input [1, 2, 3, 4]
        System.out.print("Input 2: ");
        s2 = input.nextLine();               // Contoh input [1, 3, 5, 10, 16]
        int[] arr1 = inputToIntArray(s1);
        int[] arr2 = inputToIntArray(s2);

        String s = Arrays.toString(getArrayUnique(arr1, arr2));
        System.out.println(s);
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

    public static Integer[] getArrayUnique(int arr1[], int[] arr2) {
        List<Integer> al = new ArrayList<Integer>();
        for (int i : arr1) {
            boolean sts = true;
            for (int j : arr2) {
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
