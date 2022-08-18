import java.util.Scanner;

public class P3_PairWithTargetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int t;
        System.out.print("Input: ");
        s = input.nextLine();               // Contoh input [1, 2, 3, 4, 6]
        System.out.print("Target: ");
        t = input.nextInt();

        String[] sArr = s.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");

        int size = sArr.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(sArr[i].trim());
        }

        getPairIndex(arr, arr.length, t);
    }

    public static void getPairIndex(int arr[], int n, int t)
    {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == t)
                    System.out.println("(" + i + ", " + j + ")");
    }
}
