import java.util.Arrays;

public class Lesson6_MaxProductOfThree {
    /**
     * description  : Codility Lesson 6. MaxProductOfThree
     *                Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
     *
     * solution     : 1. 배열을 정렬한다.
     *                2-1. 가장 큰 수 ~ 세번째 큰 수까지 곱을 구한다.
     *                2-2. 원소가 음수일 수도 있으므로 0, 1번째와 마지막 수의 곱도 구한다.
     *                3. 둘 중 더 큰 수를 반환한다.
     *
     * complexity   : O(N * log(N))
     */

    public static void main(String[] args){
        int[] A = {-3, 1, 2, -2, 5, 6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        Arrays.sort(A);

        int length = A.length;
        int product1 = A[length - 1] * A[length - 2] * A[length - 3];
        int product2 = A[0] * A[1] * A[length - 1];

        return (product1 > product2) ? product1 : product2;
    }

}
