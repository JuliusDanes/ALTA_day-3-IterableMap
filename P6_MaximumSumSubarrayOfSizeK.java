import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class P6_MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int k;
        System.out.print("Input: ");
        s = input.nextLine();               // Contoh input [2, 1, 5, 1, 3, 2]
        System.out.print("k: ");
        k = input.nextInt();
        int[] arr = inputToIntArray(s);

        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
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

    public static int maxSum(int arr[], int n, int k) {
        if (n < k) {
            System.out.println("Seharusnya size k > n!");
            return -1;
        }

        int res = 0;
        for (int i=0; i<k; i++)
            res += arr[i];

        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }
}
