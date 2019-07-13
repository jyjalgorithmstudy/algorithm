public class Lesson9_MaxSliceSum {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 9. MaxSliceSum
         *                배열의 구간에서 가장 큰 합계를 찾아라.
         *
         * solution     : 1. 가장 큰 누적 값 구한다. (Max 함수를 통해 [현재 값], [현재 값 + 누적 값]중 큰 것을 선택)
         *                2. 가장 큰 구간 합을 구한다. (Max 함수를 통해 [기존 합]과 [누적 값]중 큰 것을 선택)
         *
         * complexity   : O(N)
         */
        int[] A = {3, 2, -6, 4, 0};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        if (A.length == 1){
            return A[0];
        }

        int acc = 0;
        int maxSliceSum = Integer.MIN_VALUE;
        for (int value : A){
            acc = Math.max(value, value + acc);
            maxSliceSum = Math.max(maxSliceSum, acc);
        }

        return maxSliceSum;
    }
}
