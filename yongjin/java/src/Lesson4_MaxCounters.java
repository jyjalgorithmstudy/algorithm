import java.util.Arrays;

public class Lesson4_MaxCounters {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 4. MaxCounters
         *                1. 1 ≤ A[K] ≤ N 이면, result[A[i] - 1] ++
         *                2. A[K] = N + 1 이면 result 배열의 최대값으로 result 배열 초기화
         *                  > 두 조건을 만족하여 나오는 result 값을 return 하라.
         *
         * solution     : 1. 두 번째 조건이 나올 때 마다 maxCounter 변수를 배열의 최대값으로 설정한다.
         *                2. 첫 번째 조건이 나올 때 마다 maxCounter 보다 작은 경우는 maxCount + 1를 해준다. (maxCounter 만큼 배열이 초기화 되었음을 의미)
         *                3. result 배열을 돌면서 maxCounter 보다 작은 value는 maxCounter 로 변경해준다.
         *
         *                * Arrays.fill 를 사용할 때, Performance 60% 기록.
         *
         * complexity   : O(N + M)
         */
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] B = {3, 4, 4, 6, 1, 1, 4, 6};

        int[] result = solution(5, A);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    /**
     * Performance : 100%
     */
    public static int[] solution(int N, int[] A){
        int[] result = new int[N];
        int max = 0;
        int maxCounter = 0;
        int tmp;
        for(int i = 0; i < A.length; i++){
            if(1 <= A[i] && A[i] <= N) {
                if(result[A[i] - 1]  < maxCounter) {
                    result[A[i] - 1] = maxCounter + 1;
                }else{
                    result[A[i] - 1]++;
                }

                tmp = result[A[i] - 1];

                if(tmp > max) {
                    max = tmp;
                }
            }

            if(A[i] == N + 1){
                maxCounter = max;
            }
        }

        for(int i = 0; i < result.length; i++){
            if(result[i] < maxCounter){
                result[i] = maxCounter;
            }
        }

        return result;
    }

    /**
     * Performance : 60%
     */
    public static int[] solution_1(int N, int[] A){
        int[] result = new int[N];
        int max = 0;
        int tmp;/*
        for(int i = 0; i < A.length; i++){
            if(1 <= A[i] && A[i] <= N){
                result[A[i] - 1]++;
                tmp = result[A[i] - 1];
                if(tmp > max) {
                    max = tmp;
                }
            }

            if(A[i] == N + 1){
                Arrays.fill(result, max);
            }
        }
        */

        return result;
    }
}
