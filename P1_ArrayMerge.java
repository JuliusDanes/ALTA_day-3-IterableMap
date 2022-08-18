import java.util.Arrays;

public class P1_ArrayMerge {
    public static void main(String[] args) {
        String[] A = new String[]{"kazuya", "jin", "lee"};
        String[] B = new String[]{"kazuya", "feng"};
        String[] tempArr = new String[A.length+B.length], M;
        int size = 0;

        for (int i=0, j=0, k=0; (i<A.length) || (j<B.length); i++) {
            for (int x=0; x<tempArr.length; x++) {
                if ((i < A.length)) {
                    if (tempArr[x] == A[i]) { break; }
                    tempArr[k] = A[i];
                }
                else if ((j < B.length)) {
                    if (tempArr[x] == B[j]) { break; }
                    tempArr[k] = B[j];
                }
                if ((i < A.length) || (j < B.length))
                    k++;{
                    size = k;
                    break;
                }
            }

            if (i>A.length) { j++; }
        }

        M = new String[size];
        System.arraycopy(tempArr, 0, M, 0, size);
        System.out.println(Arrays.toString(M));
    }
}
