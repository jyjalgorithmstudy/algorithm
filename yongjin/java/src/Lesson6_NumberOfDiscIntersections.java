import java.util.Arrays;

public class Lesson6_NumberOfDiscIntersections {
    /**
     * description  : Codility Lesson 6. NumberOfDiscIntersections
     * solution     :
     * complexity   : O(N * log(N))
     */
    public static void main(String[] args){
        int[] A = {1, 5, 2, 1, 4, 0};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int N = A.length;
        long[] left = new long[N];
        long[] right = new long[N];

        for (int i = 0; i < N; i++) {
            left[i] = i - (long) A[i];
            right[i] = i + (long) A[i];
        }

        Arrays.sort(left);
        Arrays.sort(right);

        int intersection = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            while (j < N && right[i] >= left[j]) {
                intersection += j;
                intersection -= i;
                j++;
            }
        }

        if (intersection > 10000000) return -1;
        return intersection;
    }
}



