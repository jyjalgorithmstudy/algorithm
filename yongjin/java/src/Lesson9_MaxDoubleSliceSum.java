public class Lesson9_MaxDoubleSliceSum {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 9. MaxDoubleSliceSum
         *                3개의 인덱스 사이 값의 최대값을 구하는 문제
         *
         * solution     : 1. 배열의 오른쪽에서 부터 누적 값을 구해 배열에 담는다.
         *                2. 배열의 왼쪽에서 부터 누적 값을 구해 배열에 담는다.
         *                * (Math.max(0, ...) 를 하는 이유 : 예를 들어 double slice (3, 4, 5)는 0, 즉, 0보다 작은 값은 나오지 않는다.
         *                3. maxLeft 는 -1 maxRight 는 +1 해서 최댓값을 구한다.
         *                * maxLeft[i - 1] + maxRight[i + 1] 하는 이유 : 중간인덱스(Y)를 기준으로 사이값을 구하기 때문.
         *
         * complexity   : O(N)
         */
        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int[] maxLeft = new int[A.length];
        int[] maxRight = new int[A.length];
        for (int i = 1; i < A.length; i++) {
            maxLeft[i] = Math.max(0, maxLeft[i - 1] + A[i]);
        }

        for (int i = A.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(0, maxRight[i + 1] + A[i]);
        }

        int maxOfSum = Integer.MIN_VALUE;
        for (int i = 1; i < A.length - 1; i++) {
            maxOfSum = Math.max(maxOfSum, maxLeft[i - 1] + maxRight[i + 1]);
        }

        return maxOfSum;
    }
}
