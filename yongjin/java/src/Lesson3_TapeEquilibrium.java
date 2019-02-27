public class Lesson3_TapeEquilibrium {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 3. Lesson3_TapeEquilibrium
         *                한 배열을 인덱스를 기준으로 left와 right로 잘라서 뺀 절대값 중, 최소값을 찾는 문제.
         * solution     : 1. 배열 값의 총 합계를 구한다.
         *                2. left 값은 A[i] 값 만큼 늘어나고 right 값은 sum 값에서 A[i]만큼 줄어든다.
         *                3. 두 값 차이의 절대값을 구해서 가장 최소 값을 리턴한다.
         */
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int sum = 0;
        int leftSum = 0;
        int minumSum = 0;
        int tmpSum;

        for(int i = 0; i < A.length; i++){
            sum += A[i];
        }

        int rightSum = sum;
        for(int i = 0; i < A.length - 1; i++){
            leftSum += A[i];
            rightSum -= A[i];
            tmpSum = Math.abs(leftSum - rightSum);
            if(i == 0 || minumSum > tmpSum){
                minumSum = tmpSum;
            }
        }

        return minumSum;
    }
}
