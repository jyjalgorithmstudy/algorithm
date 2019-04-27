import java.util.Arrays;

public class Lesson6_Triangle {
    /**
     * description  : Codility Lesson 6. Triangle
     *                3개의 edge들로 삼각형이 구성될 수 있는지 결정한다.
     *
     * solution     : 1. 배열을 정렬한다.
     *                2. 가장 큰 수 ~ 세번째 수까지 해당 조건을 검사한다. 조건을 만족하면 1을 반환.
     *                  A[P] + A[Q] > A[R],
     *                  A[Q] + A[R] > A[P],
     *                  A[R] + A[P] > A[Q].
     *                3. 가장 작은 수의 인덱스가 음수일 경우는 삼각형을 만족하는 edge가 없으므로 0을 반환.
     *                * 각각의 원소는 Integer의 최소/최대값이 될 수 있으므로, 두 원소를 더하는 경우 Long type 으로 변환해주어야 한다.
     *
     * complexity   : O(N * log(N))
     */
    public static void main(String[] args){
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        Arrays.sort(A);
        for(int i = A.length - 1; i >= 0; i-- ) {
            if(i - 2 < 0) {
                return 0;
            }

            if((long)A[i - 1] + A[i - 2] > A[i]
                    && (long)A[i - 1] + A[i] > A[i - 2]
                    && (long)A[i] + A[i - 2] > A[i - 1]){
                return 1;
            }
        }
        return 0;
    }
}
